package ejercicios;

import java.util.Scanner;

public class EjMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion, cantidad, texto, total;
		
		String cadena = null;
		// int [][] nuevaMatriz = randoms(filas, columnas);

		do {

			System.out.println("Pulsa '1' si quieres empezar este programa, pulsa '0' si quieres acabar.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				
				
				System.out.println("Tu tabla es... ");
				
				System.out.println(randoms(cadena)); 

				System.out.println("Fin del programa.");
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

	public static int[][] randoms(String cadena) {
		Scanner sc = new Scanner(System.in);
		// Aqui se piden las filas y columnas
		
		System.out.println("Dime la cantidad de filas que quiere que tenga tu matriz.");
		int filas = sc.nextInt();
		System.out.println("Dime la cantidad de columnas que quiere que tenga tu matriz.");
		int columnas = sc.nextInt();

		int[][] matriz = new int[filas][columnas];
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;

		// Este es el for donde la matriz va a llenarse de numeros randoms
		for (int i = 0; i < columnas; i++) {
			cadena = "";
			for (int n = 0; n < filas; n++) {
				int random = (int) ((range * Math.random()) + min);
				
				matriz[n][i]= random;
				
				if (n == filas - 1) {
					cadena +=matriz[n][i];
				} else {
					cadena += matriz[n][i] + ", ";
				}

			}
			System.out.println(" (" + cadena + ")");
		}
		return matriz;
	}

}
