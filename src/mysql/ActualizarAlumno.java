package mysql;
import java.sql.*;

public class ActualizarAlumno {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String user = "tu_usuario";
        String password = "tu_contraseña";

        try (Connection connection = DriverManager.getConnection(dbUrl, user, password)) {
            String sqlActualizacion = "UPDATE Alumnos SET nota_media = ? WHERE nombre = ?";
            try (PreparedStatement statement = connection.prepareStatement(sqlActualizacion)) {
                statement.setDouble(1, 9.0); // Nueva nota media
                statement.setString(2, "Maria"); // Nombre del alumno a actualizar
                
                int filasActualizadas = statement.executeUpdate();
                System.out.println("Filas actualizadas: " + filasActualizadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
