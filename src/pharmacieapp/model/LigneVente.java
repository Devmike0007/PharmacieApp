/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

public class LigneVente {
    private int idLigne;
    private int idVente;
    private int idProduit;
    private int quantiteVendue;
    private double prixUnitaire;
    private String nomProduit;
    
    public LigneVente() {}
    
    public LigneVente(int idLigne, int idVente, int idProduit, int quantiteVendue, double prixUnitaire) {
        this.idLigne = idLigne;
        this.idVente = idVente;
        this.idProduit = idProduit;
        this.quantiteVendue = quantiteVendue;
        this.prixUnitaire = prixUnitaire;
    }
    
    public int getIdLigne() { return idLigne; }
    public void setIdLigne(int idLigne) { this.idLigne = idLigne; }
    
    public int getIdVente() { return idVente; }
    public void setIdVente(int idVente) { this.idVente = idVente; }
    
    public int getIdProduit() { return idProduit; }
    public void setIdProduit(int idProduit) { this.idProduit = idProduit; }
    
    public int getQuantiteVendue() { return quantiteVendue; }
    public void setQuantiteVendue(int quantiteVendue) { this.quantiteVendue = quantiteVendue; }
    
    public double getPrixUnitaire() { return prixUnitaire; }
    public void setPrixUnitaire(double prixUnitaire) { this.prixUnitaire = prixUnitaire; }
    
    public String getNomProduit() { return nomProduit; }
    public void setNomProduit(String nomProduit) { this.nomProduit = nomProduit; }
    
    public double getTotal() { return quantiteVendue * prixUnitaire; }
}

