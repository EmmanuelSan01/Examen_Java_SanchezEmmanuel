package controller;

import java.sql.*;
import dao.DBConnection;
import model.Cliente;

/**
 *
 * @author camper
 */
public class ClienteController {

    public static void registrarCliente(Cliente c) {
        String insert = "INSERT INTO cliente (nombre, representante, correo, telefono, direccion, sector) VALUES (?, ?, ?, ?, ?, ?)";
        DBConnection.connectDB();

        try (PreparedStatement stmt = DBConnection.getConn().prepareStatement(insert)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getRepresentante());
            stmt.setString(3, c.getCorreo());
            stmt.setString(4, c.getTelefono());
            stmt.setString(5, c.getDireccion());
            stmt.setString(6, c.getSector());
            stmt.executeQuery();

            System.out.println("Registrado " + c.toString());

        } catch (Exception ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
        }
    }
    
    public static void listarClientes() {
        String select = "SELECT * FROM cliente";
        DBConnection.connectDB();
    }
}