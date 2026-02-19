/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacieapp.dao;

/**
 *
 * @author Marianah Marie
 */

import pharmacieapp.model.Client;
import java.sql.SQLException;
import java.util.List;

public interface IClientDAO {
    int ajouterClient(Client client) throws SQLException;
    List<Client> getAllClients() throws SQLException;
}
