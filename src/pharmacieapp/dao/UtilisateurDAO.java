/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.dao;

/**
 *
 * @author Marianah Marie
 */

import pharmacieapp.model.Utilisateur;
import pharmacieapp.util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDAO implements IUtilisateurDAO {
    
    @Override
    public Utilisateur login(String userName, String password) throws SQLException {
        String sql = "SELECT * FROM utilisateur WHERE user_name = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userName);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Utilisateur(
                    rs.getInt("id_user"),
                    rs.getString("nom"),
                    rs.getString("user_name"),
                    rs.getString("password"),
                    rs.getString("role")
                );
            }
        }
        return null;
    }
    
    @Override
    public List<Utilisateur> getAllUtilisateurs() throws SQLException {
        List<Utilisateur> list = new ArrayList<>();
        String sql = "SELECT * FROM utilisateur";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Utilisateur(
                    rs.getInt("id_user"),
                    rs.getString("nom"),
                    rs.getString("user_name"),
                    rs.getString("password"),
                    rs.getString("role")
                ));
            }
        }
        return list;
    }
}

