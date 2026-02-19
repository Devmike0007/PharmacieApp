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

public class Vente {
    private int idVente;
    private int idClient;
    private int idVendeur;
    private Integer idCaissier;
    private Integer idMagasinier;
    private String statutVente;
    private double totalVente;
    private LocalDateTime dateVente;
    private String nomClient;
    private String telephoneClient;
    
    public Vente() {}
    
    public Vente(int idVente, int idClient, int idVendeur, String statutVente, 
                 double totalVente, LocalDateTime dateVente) {
        this.idVente = idVente;
        this.idClient = idClient;
        this.idVendeur = idVendeur;
        this.statutVente = statutVente;
        this.totalVente = totalVente;
        this.dateVente = dateVente;
    }
    
    public int getIdVente() { return idVente; }
    public void setIdVente(int idVente) { this.idVente = idVente; }
    
    public int getIdClient() { return idClient; }
    public void setIdClient(int idClient) { this.idClient = idClient; }
    
    public int getIdVendeur() { return idVendeur; }
    public void setIdVendeur(int idVendeur) { this.idVendeur = idVendeur; }
    
    public Integer getIdCaissier() { return idCaissier; }
    public void setIdCaissier(Integer idCaissier) { this.idCaissier = idCaissier; }
    
    public Integer getIdMagasinier() { return idMagasinier; }
    public void setIdMagasinier(Integer idMagasinier) { this.idMagasinier = idMagasinier; }
    
    public String getStatutVente() { return statutVente; }
    public void setStatutVente(String statutVente) { this.statutVente = statutVente; }
    
    public double getTotalVente() { return totalVente; }
    public void setTotalVente(double totalVente) { this.totalVente = totalVente; }
    
    public LocalDateTime getDateVente() { return dateVente; }
    public void setDateVente(LocalDateTime dateVente) { this.dateVente = dateVente; }
    
    public String getNomClient() { return nomClient; }
    public void setNomClient(String nomClient) { this.nomClient = nomClient; }
    
    public String getTelephoneClient() { return telephoneClient; }
    public void setTelephoneClient(String telephoneClient) { this.telephoneClient = telephoneClient; }
}

