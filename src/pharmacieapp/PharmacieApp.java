/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pharmacieapp;

/**
 *
 * @author Marianah Marie
 */
import pharmacieapp.view.LoginFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import pharmacieapp.view.*;

public class PharmacieApp {
    public static void main(String[] args) {
     java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
            new LoginFrame().setVisible(false);
            new Magasinier().setVisible(false);
            new VendeurFrame().setVisible(true);
         }
        });
        
    }
    
    
    
}

