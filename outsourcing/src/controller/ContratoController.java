package controller;

import java.sql.*;
import dao.DBConnection;
import model.Contrato;

/**
 *
 * @author camper
 */
public class ContratoController {

    public static void registrarContrato(Contrato c) {
        String insert = "INSERT INTO contrato (id_cliente, id_servicio, fechainicio, fechafin, costototal, estado) VALUES (?, ?, ?, ?, ?, ?)";
        DBConnection.connectDB();

        try (PreparedStatement stmt = DBConnection.getConn().prepareStatement(insert)) {

            stmt.setInt(1, c.getCliente());
            stmt.setInt(2, c.getServicio());
            stmt.setDate(3, (Date) c.getFechainicio());
            stmt.setDate(4, (Date) c.getFechafin());
            stmt.setDouble(5, c.getCostototal());
            stmt.setString(6, c.getEstado());
            stmt.executeQuery();

            System.out.println("Registrado " + c.toString());

        } catch (Exception ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
        }
    }
    
    public static void listarContratos() {
        String select = "SELECT * FROM contrato";
        DBConnection.connectDB();
    }
}