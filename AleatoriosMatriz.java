package exercise4;

import java.util.Scanner;

public class AleatoriosMatriz {
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion, cantidad, texto, total;
		String ola = randoms(filas, columnas, cadena);

		do {

			System.out.println("Pulsa '1' si quieres empezar este programa, pulsa '0' si quieres acabar.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Dime la cantidad de filas que quiere que tenga tu matriz.");
				int filas = sc.nextInt();
				System.out.println("Dime la cantidad de columnas que quiere que tenga tu matriz.");
				int columnas = sc.nextInt();

				System.out.println("Tu tabla es... ");
				System.out.println(ola);
				break;
			case 0:
				System.out.println("Adios.");
				break;
			default:
				System.out.println("Error, vuelve a intentarlo.");
				break;
			}

		} while (opcion != 0);

		sc.close();
	}
	public static String randoms(int filas, int columnas, String cadena) {
		int[][] matriz = new int[filas][columnas];
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;
		for (int i = 0; i < columnas; i++) {
			cadena = "";
			for (int n = 0; n < filas; n++) {
				int random = (int) ((range * Math.random()) + min);
				System.out.println(random);
				matriz[filas][columnas] = random;
				if (n == filas-1) {
					cadena += matriz[filas][columnas];
				}
				else {
					cadena += matriz[filas][columnas]+", ";
				}
			}
			System.out.println("\n ("+cadena+")");
		}
		return cadena;
	}
	
	
	

}
