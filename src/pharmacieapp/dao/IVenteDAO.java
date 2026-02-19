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
import java.sql.SQLException;
import java.util.List;

public interface IVenteDAO {
    int creerVente(Vente vente, List<LigneVente> lignes) throws SQLException;
    List<Vente> getAllVentes() throws SQLException;
    List<LigneVente> getLignesVente(int idVente) throws SQLException;
    void updateStatut(int idVente, String statut) throws SQLException;
}

