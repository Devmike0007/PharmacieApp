/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.model;

/**
 *
 * @author Marianah Marie
 */

public class Utilisateur {
    private int idUser;
    private String nom;
    private String userName;
    private String password;
    private String role;
    
    public Utilisateur() {}
    
    public Utilisateur(int idUser, String nom, String userName, String password, String role) {
        this.idUser = idUser;
        this.nom = nom;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    
    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}

