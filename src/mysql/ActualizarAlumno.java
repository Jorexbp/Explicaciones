package mysql;
import java.sql.*;

public class ActualizarAlumno {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Alumnos";
        String user = "java";
        String password = "password";

        try (Connection connection =
        		DriverManager.getConnection(dbUrl, user, password)) {
        	
            String sqlActualizacion =
            		"UPDATE Alumnos SET nota_media = ? WHERE nombre = ?";
            
            try (PreparedStatement statement =
            		connection.prepareStatement(sqlActualizacion)) {
            	
                statement.setDouble(1, 7.25); // Nueva nota media
                statement.setString(2, "Luis"); // Nombre del alumno a actualizar
                
                int filasActualizadas = statement.executeUpdate();
                
                System.out.println("Filas actualizadas: " +
                		filasActualizadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
