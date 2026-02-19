/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

public class Client {
    private int idClient;
    private String nom;
    private String telephone;
    
    public Client() {}
    
    public Client(int idClient, String nom, String telephone) {
        this.idClient = idClient;
        this.nom = nom;
        this.telephone = telephone;
    }
    
    public int getIdClient() { return idClient; }
    public void setIdClient(int idClient) { this.idClient = idClient; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}

