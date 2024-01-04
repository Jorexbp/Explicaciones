package juegos;

import java.util.Scanner;

public class TresEnRaya {

	private static char[][] reiniciarTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = ' ';
			}
		}
		return tablero;
	}

	private static void mostrarTablero(char[][] tablero) {
		System.out.println(" " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
		System.out.println("---|---|---");
		System.out.println(" " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
		System.out.println("---|---|---");
		System.out.println(" " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + "\n");

	}

	private static char[][] movimientoJugador(char[][] tablero) {
		int fila, columna;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Introduzca el # de fila (1-3): ");
			fila = sc.nextInt() - 1;

			System.out.println("Introduzca el # de columna (1-3): ");
			columna = sc.nextInt() - 1;

			if (tablero[fila][columna] != ' ') {
				System.out.println("Movimiento invalido");
			} else {
				tablero[fila][columna] = 'X';
				break;
			}

		} while (true);
		sc.close();
		return tablero;
	}

	private static char[][] movimientoOrdenador(char[][] tablero) {
		int fila, columna;

		do {
			fila = (int) (Math.random() * 2);
			columna = (int) (Math.random() * 2);

			if (tablero[fila][columna] == ' ') {
				tablero[fila][columna] = 'O';
				break;
			} else if (espaciosDisponibles(tablero) == 0 || comprobarGanador(tablero) != ' ') {
				break;
			}

		} while (true);
		return tablero;
	}

	private static int espaciosDisponibles(char[][] tablero) {
		int espacios = 9; // espacios totales

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] != ' ') // i = 0 y j = 0
				{
					espacios--;
				}
			}
		}

		return espacios;
	}

	private static char comprobarGanador(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) { // filas

			// Comprobacion de filas
			if (tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
				return tablero[i][0];
			}
			// Comprobacion de columnas
			else if (tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
				return tablero[0][i];
			}
			// Comprobacion de diagonales
			else if (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
				return tablero[0][0];
			}
			// Comprobacion de diagonales
			else if (tablero[2][0] == tablero[1][1] && tablero[2][0] == tablero[0][2]) {
				return tablero[2][0];
			}

		}
		return ' ';
	}

	private static void mostrarGanador(char ganador) {
		// ganador = (' ' o 'X' o 'O')

		switch (ganador) { // Valor a comprobar

		case 'X': { // Posible valor
			System.out.println("HAS GANADO!");
			break;
		}
		case 'O': { // Posible valor
			System.out.println("HAS PERDIDO!");
			break;
		}
		default: // Valor no encontrado
			System.out.println("EMPATE!");
			break;
		}

	}

	public static void main(String args[]) {
		char tablero[][] = {
				// 0 	1	 2 = j
				{ '1', '2', '3' }, // Fila 0 = i
				{ '4', '5', '6' }, // Fila 1 = i
				{ '7', '8', '9' }  // Fila 2 = i
		};

		tablero = reiniciarTablero(tablero); // char[][]
		char ganador = ' ';
		Scanner sc = new Scanner(System.in);
		do {
			mostrarTablero(tablero); // void

			tablero = movimientoJugador(tablero);

			tablero = movimientoOrdenador(tablero);

			int espaciosDisponibles = espaciosDisponibles(tablero);
			ganador = comprobarGanador(tablero);

			if (espaciosDisponibles == 0 || ganador != ' ') {
				mostrarGanador(ganador);
				System.out.println("¿Quiere volver a jugar? (Y/N)");
				String usuario = sc.next();

				if (usuario.toUpperCase().equals("Y")) {
					tablero = reiniciarTablero(tablero); // char[][]
					continue;
				} else {
					break;
				}
			}

		} while (true);
		sc.close();

	}
}
