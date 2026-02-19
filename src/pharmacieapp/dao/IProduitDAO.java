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
import java.sql.SQLException;
import java.util.List;

public interface IProduitDAO {
    List<Produit> getAllProduits() throws SQLException;
    void ajouterProduit(Produit produit) throws SQLException;
    void modifierProduit(Produit produit) throws SQLException;
    void supprimerProduit(int idProduit) throws SQLException;
    List<TypeProduit> getAllTypes() throws SQLException;
    List<CategorieProduit> getAllCategories() throws SQLException;
}

