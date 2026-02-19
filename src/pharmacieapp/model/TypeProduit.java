/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

public class TypeProduit {
    private int idType;
    private String nomType;
    
    public TypeProduit() {}
    
    public TypeProduit(int idType, String nomType) {
        this.idType = idType;
        this.nomType = nomType;
    }
    
    public int getIdType() { return idType; }
    public void setIdType(int idType) { this.idType = idType; }
    
    public String getNomType() { return nomType; }
    public void setNomType(String nomType) { this.nomType = nomType; }
    
    @Override
    public String toString() { return nomType; }
}

