package controller;

import java.sql.*;
import dao.DBConnection;
import model.Servicio;

/**
 *
 * @author camper
 */
public class ServicioController {

    public static void registrarServicio(Servicio s) {
        String insert = "INSERT INTO servicio (nombre, descripcion, precioxhora, categoria) VALUES (?, ?, ?, ?)";
        DBConnection.connectDB();

        try (PreparedStatement stmt = DBConnection.getConn().prepareStatement(insert)) {

            stmt.setString(1, s.getNombre());
            stmt.setString(2, s.getDescripcion());
            stmt.setDouble(3, s.getPrecioxhora());
            stmt.setString(4, s.getCategoria());
            stmt.executeQuery();

            System.out.println("Registrado " + s.toString());

        } catch (Exception ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
        }
    }
    
    public static void listarServicios() {
        String select = "SELECT * FROM servicio";
        DBConnection.connectDB();
    }
}