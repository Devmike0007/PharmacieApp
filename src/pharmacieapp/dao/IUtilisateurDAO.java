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
import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDAO {
    Utilisateur login(String userName, String password) throws SQLException;
    List<Utilisateur> getAllUtilisateurs() throws SQLException;
}

