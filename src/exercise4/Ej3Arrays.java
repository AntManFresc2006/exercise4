package exercise4;

import java.util.Scanner;

public class Ej3Arrays {

	public static void main(String[] args) {
		System.out.println(
				"\nSaludos, este es un programa que registra nombres de usuario y permite hacer una consulta de estos nombres");

		System.out.println("\nPulsa (1) si quieres introducir un nombre y la edad.");

		System.out.println("\nPulsa (2) para ver la cantidad de nombres introducidos.");

		System.out.println("\nPulsa (3) si quieres que te imprima todos estos nombres al reves.");

		System.out.println("\nPulsa (4) si quieres buscar un usuario en especifico.");

		System.out.println("\nPulsa (5) si quieres salir de este programa.");

		Scanner sc = new Scanner(System.in);

		int busqueda;
		int acumulador = -1;
		int opcion;

		int caja = -1;
		int cajaDos = -1;

		String nombre[] = new String[20];
		int edad[] = new int[20];

		opcion = sc.nextInt();

		String eleccion;
		int eleccion2;

		while (opcion == 2 && caja == -1 || (opcion < 1 || opcion > 5)) {
			System.out.println("\n...");
			System.out.println(
					"\nPuede que hayas introducido un numero que no sea 1, 2, 3, 4 o 5 o no introduciste previamente un nombre, no muestra nada en nuestra base de datos.");
			System.out.println("\nVuelve a intentarlo pulsando 1, 2, 3, 4 o 5.");
			opcion = sc.nextInt();

		}

		do {
			switch (opcion) {

			case 1:

				caja++;

				System.out.println("\nDime el nombre que quieres introducir.");

				sc.nextLine();

				eleccion = sc.nextLine();

				nombre[caja] = eleccion;

				cajaDos++;
				System.out.println("\nAhora dime su edad.");
				eleccion2 = sc.nextInt();

				while (eleccion2 <= 0 || eleccion2 > 99) {
					System.out.println("\nError, vuelve a introducirme la edad.");
					eleccion2 = sc.nextInt();
				}

				edad[cajaDos] = eleccion2;
				System.out.println("\nAhora pulsa 1, 2, 3, 4 o 5.");
				opcion = sc.nextInt();

				while (opcion > 5 || opcion < 1) {

					System.out.println("\nError, vuelve a introducir el numero.");
					opcion = sc.nextInt();

				}
				acumulador++;
				break;
			case 2:

				System.out.println("Aqui te voy a mostrar todos tus datos introducidos.");

				for (int i = 0; i < nombre.length; i++) {

					if (i <= caja) {
						System.out.println(i + 1 + ".- " + nombre[i] + " --- " + edad[i] + " años.");
					}

				}

				System.out.println("\nAhora pulsa 1, 2, 3, 4 o 5.");
				opcion = sc.nextInt();
				while (opcion > 5 || opcion < 1) {

					System.out.println("\nError, vuelve a introducir el numero.");
					opcion = sc.nextInt();

				}
				break;

			case 3:
				System.out.println("\nAqui te voy a mostrar todos tus datos ordenados al reves.");

				for (int n = nombre.length; n > -1; n--) {

					if (n >= 0 && n <= caja)
						System.out.println(n + 1 + ".- " + nombre[n] + " --- " + edad[n] + " años.");
				}
				System.out.println("\nAhora pulsa 1, 2, 3, 4 o 5.");

				opcion = sc.nextInt();
				while (opcion > 5 || opcion < 1) {

					System.out.println("\nError, vuelve a introducir el numero.");
					opcion = sc.nextInt();

				}
				break;

			case 4 :
				while (caja < 0) {
					System.out.println(
							"No has introducido ningun usuario, por lo tanto no puedes buscar ninguno, vuelve intentarlo pulsando 1, 2, 3, 4 o 5.");
					opcion = sc.nextInt();
				}

				System.out.println("Dime, mediante un numero, que persona quieres buscar.");

				busqueda = sc.nextInt();

				while (busqueda < 0 || busqueda > nombre.length) {
					System.out.println("Error, vuelve a introducir un numero.");
					busqueda = sc.nextInt();
				}

				for (int p = 0; p < nombre.length; ++p) {
					while (nombre[busqueda-1].equals(null) || edad[busqueda-1] < 1) {
						System.out.println("Error, has introducido " + acumulador
								+ " usuarios, y estas buscando un usuario en una posicion " + busqueda
								+ ", vuelve a intentarlo.");
						busqueda = sc.nextInt();
					}
					if (p == busqueda) {
						System.out.println("El usuario que estabas buscando es: " + nombre[p - 1] + " con "
								+ edad[p - 1] + " años.");
					}
				}

				System.out.println("\nAhora pulsa 1, 2, 3, 4 o 5.");

				opcion = sc.nextInt();
				while (opcion > 5 || opcion < 1) {

					System.out.println("\nError, vuelve a introducir el numero.");
					opcion = sc.nextInt();

				}
				break;
			default:
			}
		} while (opcion >= 1 && opcion < 5);

		System.out.println("\nFin del programa.");

		sc.close();

	}
}
