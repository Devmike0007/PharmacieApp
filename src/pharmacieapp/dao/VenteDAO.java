/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.dao;

/**
 *
 * @author Marianah Marie
 */

import pharmacieapp.model.Vente;
import pharmacieapp.model.LigneVente;
import pharmacieapp.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VenteDAO implements IVenteDAO {
    
    @Override
    public int creerVente(Vente vente, List<LigneVente> lignes) throws SQLException {
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            
            String sql = "INSERT INTO vente (id_client, id_vendeur, statut_vente, total_vente, date_vente) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, vente.getIdClient());
            stmt.setInt(2, vente.getIdVendeur());
            stmt.setString(3, vente.getStatutVente());
            stmt.setDouble(4, vente.getTotalVente());
            stmt.setTimestamp(5, Timestamp.valueOf(vente.getDateVente()));
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            int idVente = 0;
            if (rs.next()) {
                idVente = rs.getInt(1);
            }
            
            String sqlLigne = "INSERT INTO ligne_vente (id_vente, id_produit, quantite_vendue, prix_unitaire) VALUES (?, ?, ?, ?)";
            PreparedStatement stmtLigne = conn.prepareStatement(sqlLigne);
            for (LigneVente ligne : lignes) {
                stmtLigne.setInt(1, idVente);
                stmtLigne.setInt(2, ligne.getIdProduit());
                stmtLigne.setInt(3, ligne.getQuantiteVendue());
                stmtLigne.setDouble(4, ligne.getPrixUnitaire());
                stmtLigne.executeUpdate();
                
                String sqlStock = "UPDATE produit SET quantite_stock = quantite_stock - ? WHERE id_produit = ?";
                PreparedStatement stmtStock = conn.prepareStatement(sqlStock);
                stmtStock.setInt(1, ligne.getQuantiteVendue());
                stmtStock.setInt(2, ligne.getIdProduit());
                stmtStock.executeUpdate();
            }
            
            conn.commit();
            return idVente;
        } catch (SQLException e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            if (conn != null) conn.close();
        }
    }
    
    @Override
    public List<Vente> getAllVentes() throws SQLException {
        List<Vente> list = new ArrayList<>();
        String sql = "SELECT v.*, c.nom as nom_client, c.telephone as telephone_client " +
                     "FROM vente v " +
                     "LEFT JOIN client c ON v.id_client = c.id_client " +
                     "ORDER BY v.date_vente DESC";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Vente v = new Vente();
                v.setIdVente(rs.getInt("id_vente"));
                v.setIdClient(rs.getInt("id_client"));
                v.setIdVendeur(rs.getInt("id_vendeur"));
                v.setStatutVente(rs.getString("statut_vente"));
                v.setTotalVente(rs.getDouble("total_vente"));
                v.setDateVente(rs.getTimestamp("date_vente").toLocalDateTime());
                v.setNomClient(rs.getString("nom_client"));
                v.setTelephoneClient(rs.getString("telephone_client"));
                list.add(v);
            }
        }
        return list;
    }
    
    @Override
    public List<LigneVente> getLignesVente(int idVente) throws SQLException {
        List<LigneVente> list = new ArrayList<>();
        String sql = "SELECT lv.*, p.nom_produit " +
                     "FROM ligne_vente lv " +
                     "LEFT JOIN produit p ON lv.id_produit = p.id_produit " +
                     "WHERE lv.id_vente = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idVente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                LigneVente lv = new LigneVente(
                    rs.getInt("id_ligne"),
                    rs.getInt("id_vente"),
                    rs.getInt("id_produit"),
                    rs.getInt("quantite_vendue"),
                    rs.getDouble("prix_unitaire")
                );
                lv.setNomProduit(rs.getString("nom_produit"));
                list.add(lv);
            }
        }
        return list;
    }
    
    @Override
    public void updateStatut(int idVente, String statut) throws SQLException {
        Connection conn = null;
        try {
            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);
            
            String sql = "UPDATE vente SET statut_vente = ? WHERE id_vente = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, statut);
            stmt.setInt(2, idVente);
            stmt.executeUpdate();
            
            if ("payee".equals(statut)) {
                String sqlFacture = "INSERT INTO facture (id_vente, date_facture) VALUES (?, NOW())";
                PreparedStatement stmtFacture = conn.prepareStatement(sqlFacture);
                stmtFacture.setInt(1, idVente);
                stmtFacture.executeUpdate();
            }
            
            conn.commit();
        } catch (SQLException e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            if (conn != null) conn.close();
        }
    }
}

