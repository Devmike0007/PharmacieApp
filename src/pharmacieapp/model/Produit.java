/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

public class Produit {
    private int idProduit;
    private String nomProduit;
    private int idType;
    private int idCategorie;
    private String dosage;
    private double prixVente;
    private int quantiteStock;
    private String nomType;
    private String nomCategorie;
    
    public Produit() {}
    
    public Produit(int idProduit, String nomProduit, int idType, int idCategorie, 
                   String dosage, double prixVente, int quantiteStock) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.idType = idType;
        this.idCategorie = idCategorie;
        this.dosage = dosage;
        this.prixVente = prixVente;
        this.quantiteStock = quantiteStock;
    }
    
    public int getIdProduit() { return idProduit; }
    public void setIdProduit(int idProduit) { this.idProduit = idProduit; }
    
    public String getNomProduit() { return nomProduit; }
    public void setNomProduit(String nomProduit) { this.nomProduit = nomProduit; }
    
    public int getIdType() { return idType; }
    public void setIdType(int idType) { this.idType = idType; }
    
    public int getIdCategorie() { return idCategorie; }
    public void setIdCategorie(int idCategorie) { this.idCategorie = idCategorie; }
    
    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    
    public double getPrixVente() { return prixVente; }
    public void setPrixVente(double prixVente) { this.prixVente = prixVente; }
    
    public int getQuantiteStock() { return quantiteStock; }
    public void setQuantiteStock(int quantiteStock) { this.quantiteStock = quantiteStock; }
    
    public String getNomType() { return nomType; }
    public void setNomType(String nomType) { this.nomType = nomType; }
    
    public String getNomCategorie() { return nomCategorie; }
    public void setNomCategorie(String nomCategorie) { this.nomCategorie = nomCategorie; }
}

