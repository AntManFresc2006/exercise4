package exercise4;

import java.util.Scanner;

public class AleatoriosMatriz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		String cadena;
		//int [][] nuevaMatriz = randoms(filas, columnas);

		do {

			System.out.println("Pulsa '1' si quieres empezar este programa, pulsa '0' si quieres acabar.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
			
				int filas;
				int columnas;
				//int[][] ola = randoms(cadena, filas, columnas);
				//System.out.println(ola);
				System.out.println("Tu tabla es... ");
				
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
	public static int [][] randoms(Scanner sc, int filas, int columnas) {
		//Aqui se piden las filas y columnas
		System.out.println("Dime la cantidad de filas que quiere que tenga tu matriz.");
		filas = sc.nextInt();
		System.out.println("Dime la cantidad de columnas que quiere que tenga tu matriz.");
		columnas = sc.nextInt();
		
		int[][] matriz = new int[filas][columnas];
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;
		
		//Este es el for donde la matriz va a llenarse de numeros randoms
		for (int i = 0; i < columnas; i++) {
			for (int n = 0; n < filas; n++) {
				int random = (int) ((range * Math.random()) + min);
				System.out.println(random);
				matriz[filas][columnas] = random;
				
			}
		}
		sc.close();
		
		return matriz;
	}
	
	
	

}
