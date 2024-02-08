package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcessElim {
    public static void main(String[] args) {
        String dbUrl = "jdbc:ucanaccess://Ejemplo.accdb";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
             String sqlEliminacion = "DELETE FROM empleados WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sqlEliminacion)) {
                statement.setInt(1, 1);
                
                int filasAfectadas = statement.executeUpdate();
                System.out.println("Filas eliminadas: " + filasAfectadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
