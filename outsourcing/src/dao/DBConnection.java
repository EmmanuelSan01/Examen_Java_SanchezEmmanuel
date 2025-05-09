package dao;

import java.sql.*;

/**
 *
 * @author camper
 */
public class DBConnection {

    private static final String host = "jdbc:mysql://localhost:3306/";
    private static final String user = "campus2023";
    private static final String password = "campus2023";
    private static final String db = "outsourcing";
    private static final String cadConex = host + db;
    private static Connection conn = null;

    public static void connectDB() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(cadConex, user, password);
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        }
    }

    public void disconnectDB() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión a BD cerrada");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
            }
        }
    }

    public static Connection getConn() {
        return conn;
    }
}