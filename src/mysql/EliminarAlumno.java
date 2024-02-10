package mysql;
import java.sql.*;

public class EliminarAlumno {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String user = "tu_usuario";
        String password = "tu_contraseña";

        try (Connection connection = DriverManager.getConnection(dbUrl, user, password)) {
            String sqlEliminacion = "DELETE FROM Alumnos WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sqlEliminacion)) {
                statement.setInt(1, 1); // ID del alumno a eliminar
                
                int filasEliminadas = statement.executeUpdate();
                System.out.println("Filas eliminadas: " + filasEliminadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
