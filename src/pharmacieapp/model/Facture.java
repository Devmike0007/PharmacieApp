/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

import java.time.LocalDateTime;

public class Facture {
    private int idFacture;
    private int idVente;
    private LocalDateTime dateFacture;
    
    public Facture() {}
    
    public Facture(int idFacture, int idVente, LocalDateTime dateFacture) {
        this.idFacture = idFacture;
        this.idVente = idVente;
        this.dateFacture = dateFacture;
    }
    
    public int getIdFacture() { return idFacture; }
    public void setIdFacture(int idFacture) { this.idFacture = idFacture; }
    
    public int getIdVente() { return idVente; }
    public void setIdVente(int idVente) { this.idVente = idVente; }
    
    public LocalDateTime getDateFacture() { return dateFacture; }
    public void setDateFacture(LocalDateTime dateFacture) { this.dateFacture = dateFacture; }
}

