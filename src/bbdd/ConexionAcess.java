package bbdd;

import java.sql.*;

public class ConexionAcess {
    public static void main(String[] args) {
     String dbUrl = "jdbc:ucanaccess://Ejemplo.accdb";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            String sql = "SELECT * FROM empleados";

            try (Statement statement = connection.createStatement()) {
            	
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                	
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String nombre = resultSet.getString("nombre");
                        int edad = resultSet.getInt("edad");
                        
                        System.out.println("ID: " + id + ", Nombre: " +
                        				nombre + ", Edad: " + edad);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
