/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.dao;

/**
 *
 * @author Marianah Marie
 */

import pharmacieapp.model.Produit;
import pharmacieapp.model.TypeProduit;
import pharmacieapp.model.CategorieProduit;
import pharmacieapp.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitDAO implements IProduitDAO {
    
    @Override
    public List<Produit> getAllProduits() throws SQLException {
        List<Produit> list = new ArrayList<>();
        String sql = "SELECT p.*, t.nom_type, c.nom_categorie " +
                     "FROM produit p " +
                     "LEFT JOIN type_produit t ON p.id_type = t.id_type " +
                     "LEFT JOIN categorie_produit c ON p.id_categorie = c.id_categorie " +
                     "ORDER BY p.nom_produit";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produit p = new Produit(
                    rs.getInt("id_produit"),
                    rs.getString("nom_produit"),
                    rs.getInt("id_type"),
                    rs.getInt("id_categorie"),
                    rs.getString("dosage"),
                    rs.getDouble("prix_vente"),
                    rs.getInt("quantite_stock")
                );
                p.setNomType(rs.getString("nom_type"));
                p.setNomCategorie(rs.getString("nom_categorie"));
                list.add(p);
            }
        }
        return list;
    }
    
    @Override
    public void ajouterProduit(Produit produit) throws SQLException {
        String sql = "INSERT INTO produit (nom_produit, id_type, id_categorie, dosage, prix_vente, quantite_stock) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produit.getNomProduit());
            stmt.setInt(2, produit.getIdType());
            stmt.setInt(3, produit.getIdCategorie());
            stmt.setString(4, produit.getDosage());
            stmt.setDouble(5, produit.getPrixVente());
            stmt.setInt(6, produit.getQuantiteStock());
            stmt.executeUpdate();
        }
    }
    
    @Override
    public void modifierProduit(Produit produit) throws SQLException {
        String sql = "UPDATE produit SET nom_produit=?, id_type=?, id_categorie=?, dosage=?, prix_vente=?, quantite_stock=? WHERE id_produit=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produit.getNomProduit());
            stmt.setInt(2, produit.getIdType());
            stmt.setInt(3, produit.getIdCategorie());
            stmt.setString(4, produit.getDosage());
            stmt.setDouble(5, produit.getPrixVente());
            stmt.setInt(6, produit.getQuantiteStock());
            stmt.setInt(7, produit.getIdProduit());
            stmt.executeUpdate();
        }
    }
    
    @Override
    public void supprimerProduit(int idProduit) throws SQLException {
        String sql = "DELETE FROM produit WHERE id_produit=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProduit);
            stmt.executeUpdate();
        }
    }
    
    @Override
    public List<TypeProduit> getAllTypes() throws SQLException {
        List<TypeProduit> list = new ArrayList<>();
        String sql = "SELECT * FROM type_produit ORDER BY nom_type";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new TypeProduit(
                    rs.getInt("id_type"),
                    rs.getString("nom_type")
                ));
            }
        }
        return list;
    }
    
    @Override
    public List<CategorieProduit> getAllCategories() throws SQLException {
        List<CategorieProduit> list = new ArrayList<>();
        String sql = "SELECT * FROM categorie_produit ORDER BY nom_categorie";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new CategorieProduit(
                    rs.getInt("id_categorie"),
                    rs.getString("nom_categorie")
                ));
            }
        }
        return list;
    }
}
