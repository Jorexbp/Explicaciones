package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccessEliminar {
	public static void main(String[] args) {
		String dbUrl = "jdbc:ucanaccess://Ejemplo.accdb";

		try (Connection connection = DriverManager.getConnection(dbUrl)) {
			String sqlActualizacion = "UPDATE empleados"
							+ " SET edad = ? WHERE nombre = ?";
			try (PreparedStatement statement =
						connection.prepareStatement(sqlActualizacion)) {
				
				statement.setInt(1, 40); // Nueva edad
				statement.setString(2, "Luis"); // Nombre del empleado

				int filasAfectadas = statement.executeUpdate();
				System.out.println("Filas actualizadas: " + filasAfectadas);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
