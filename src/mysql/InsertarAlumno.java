package mysql;
import java.sql.*;

public class InsertarAlumno {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Alumnos";
        String user = "java";
        String password = "password";

        try (Connection connection =
        		DriverManager.getConnection(dbUrl, user, password)) {
        	
            String sqlInsercion = "INSERT INTO Alumnos"
            		+ " (nombre, nota_media, fecha_nacimiento,"
            		+ " nacionalidad_espanola) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement statement =
            		connection.prepareStatement(sqlInsercion)) {
            	
                statement.setString(1, "Luis");
                statement.setDouble(2, 6.25);
                statement.setDate(3, java.sql.Date.valueOf("2003-02-02"));
                statement.setBoolean(4, false);
                
                int filasInsertadas = statement.executeUpdate();
                System.out.println("Filas insertadas: " + filasInsertadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
