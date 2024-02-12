package ejercicios2;

import java.util.Scanner;

public class TicTacToeFinal {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);
		System.out.println("JUEGO 3 EN RAYA: TABLERO DE POSICIONES");
		System.out.println("Posicion fila-columna");
		System.out.println("\n");
		char[][] tablero = new char[3][3];
		int fila;
		int columna;
		int juego = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" Posicion " + i + j + " ");
			}
			System.out.println("\n");
		}

		System.out.println("\n");
		System.out.println("Tablero inicial");
		System.out.println("\n");

		// Inicializo el tablero en cada posicion vacia se visualizara un '-'

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = '-';
			}
		}

		// Muestro el tablero inicial
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + tablero[i][j] + " ");
			}
			System.out.println("\n");
		}

		System.out.println("JUGADOR 1 (J1) INGRESE LA POSICION DONDE SE MARCARA CON X :");
		System.out.print("Nº Fila : ");
		fila = lectura.nextInt();
		while (fila < 0 || fila > 2) {
			System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
			System.out.print("Nº Fila : ");
			fila = lectura.nextInt();
		}
		System.out.print("Nº Columna : ");
		columna = lectura.nextInt();
		while (columna < 0 || columna > 2) {
			System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
			System.out.print("Nº columna : ");
			columna = lectura.nextInt();
		}
		System.out.println("\n");
		tablero[fila][columna] = 'X';

		// muestro el juego luego de cada turno
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + tablero[i][j] + " ");
			}
			System.out.println("\n");
		}

		while (juego == 0) {

			// turno jugado 2
			System.out.println("JUGADOR 2 (J2) INGRESE LA POSICION DONDE SE MARCARA CON O :");
			System.out.print("Nº Fila : ");
			fila = lectura.nextInt();
			while (fila < 0 || fila > 2) {
				System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
				System.out.print("Nº Fila : ");
				fila = lectura.nextInt();
			}
			System.out.print("Nº Columna : ");
			columna = lectura.nextInt();
			while (columna < 0 || columna > 2) {
				System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
				System.out.print("Nº columna : ");
				columna = lectura.nextInt();
			}
			System.out.println("\n");
			while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
				System.out.println("La posicion esta ocupada. Indique otra posicion :");
				System.out.print("Nº Fila : ");
				fila = lectura.nextInt();
				while (fila < 0 || fila > 2) {
					System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
					System.out.print("Nº Fila : ");
					fila = lectura.nextInt();
				}
				System.out.print("Nº Columna : ");
				columna = lectura.nextInt();
				while (columna < 0 || columna > 2) {
					System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
					System.out.print("Nº columna : ");
					columna = lectura.nextInt();
				}
				System.out.println("\n");
			}

			tablero[fila][columna] = 'O';

			// muestro el juego luego de cada turno
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(" " + tablero[i][j] + " ");
				}
				System.out.println("\n");
			}

			if ((tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O')
					|| (tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[1][2] == 'O')
					|| (tablero[2][0] == 'O' && tablero[2][1] == 'O' && tablero[2][2] == 'O' || (tablero[0][0] == 'O'
							&& tablero[1][0] == 'O' && tablero[2][0] == 'O'
							|| (tablero[0][1] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == 'O'
									|| (tablero[0][2] == 'O' && tablero[1][2] == 'O' && tablero[2][2] == 'O')
									|| (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O')
									|| (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O'))))) {

				juego = 1;
				System.out.print("Jugador 2. GANASTE!!!!! ");

			}

			// turno jugador 1
			if (juego == 0) {

				System.out.println("JUGADOR 1 (J1) INGRESE LA POSICION DONDE SE MARCARA CON X :");
				System.out.print("Nº Fila : ");
				fila = lectura.nextInt();
				while (fila < 0 || fila > 2) {
					System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
					System.out.print("Nº Fila : ");
					fila = lectura.nextInt();
				}
				System.out.print("Nº Columna : ");
				columna = lectura.nextInt();
				while (columna < 0 || columna > 2) {
					System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
					System.out.print("Nº columna : ");
					columna = lectura.nextInt();
				}
				System.out.println("\n");
				while (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
					System.out.println("La posicion esta ocupada. Indique otra posicion :");
					System.out.print("Nº Fila : ");
					fila = lectura.nextInt();
					while (fila < 0 || fila > 2) {
						System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
						System.out.print("Nº Fila : ");
						fila = lectura.nextInt();
					}
					System.out.print("Nº Columna : ");
					columna = lectura.nextInt();
					while (columna < 0 || columna > 2) {
						System.out.println("POSICION INVALIDA INGRESE VALORES DE 0 A 2 :");
						System.out.print("Nº columna : ");
						columna = lectura.nextInt();
					}
					System.out.println("\n");
				}

				tablero[fila][columna] = 'X';

				// muestro el juego luego de cada turno
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(" " + tablero[i][j] + " ");
					}
					System.out.println("\n");
				}

				if ((tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X')
						|| (tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X')
						|| (tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X'
								|| (tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X'
										|| (tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X'
												|| (tablero[0][2] == 'X' && tablero[1][2] == 'X'
														&& tablero[2][2] == 'X')
												|| (tablero[0][0] == 'X' && tablero[1][1] == 'X'
														&& tablero[2][2] == 'X')
												|| (tablero[0][2] == 'X' && tablero[1][1] == 'X'
														&& tablero[2][0] == 'X'))))) {

					juego = 1;
					System.out.print("Jugador 1. GANASTE!!!!! ");

				}

			}

			int cont = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (tablero[i][j] != '-') {
						cont++;
					}
				}
			}

			if (cont == 9) {
				juego = 2;
				System.out.print("Partida empatada");
			}

		}
		lectura.close();
	}

}