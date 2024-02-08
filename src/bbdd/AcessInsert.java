package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcessInsert {
    public static void main(String[] args) {
        String dbUrl = "jdbc:ucanaccess://Ejemplo.accdb";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            String sqlInsercion = "INSERT INTO empleados"
            		+ "	 (nombre, edad) VALUES (?, ?)";
            try (PreparedStatement statement =
            			connection.prepareStatement(sqlInsercion)) {
                statement.setString(1, "Lucia");
                statement.setInt(2, 25);
                
                int filasAfectadas = statement.executeUpdate();
                System.out.println("Filas insertadas: " + filasAfectadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

