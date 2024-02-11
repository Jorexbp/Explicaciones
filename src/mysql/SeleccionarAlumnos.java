package mysql;
import java.sql.*;

public class SeleccionarAlumnos {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Alumnos";
        String user = "java";
        String password = "password";

        try (Connection connection =
        			DriverManager.getConnection(dbUrl, user, password)) {
            String sqlConsulta = "SELECT * FROM Alumnos";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sqlConsulta)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    double notaMedia = resultSet.getDouble("nota_media");
                    Date fechaNacimiento =
                    		resultSet.getDate("fecha_nacimiento");
                    boolean nacionalidadEsp =
                    		resultSet.getBoolean("nacionalidad_espanola");
                    
                    System.out.println("ID: " + id + ","
                    		+ " Nombre: " + nombre + ","
                    		+ " Nota Media: " + notaMedia + ","
                    		+ " Fecha de Nacimiento: " + fechaNacimiento + ","
                    		+ " Nacionalidad Española: " + nacionalidadEsp);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
