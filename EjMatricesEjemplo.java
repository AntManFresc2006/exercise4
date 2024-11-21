package exercise4;

import java.util.Scanner;

public class EjMatricesEjemplo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		System.out.println("Pallaringas no.");
		
		int matriz[][] = new int [3] [3];
		int matriz3D[][][] = new int [5] [8] [6];
		int matrizConValores [] [] = {{1,2}, {3,4}, {5,6}};
		
		for (int i = 0; i < matriz.length; i++) {
			cadena = "";
			for (int n = 0; n < matriz.length; n++) {
				
				matriz[i][n] = 20+n-3*i;
				if (n == matriz.length-1) {
					cadena += matriz[i][n];
				}
				else {
					cadena += matriz[i][n]+", ";
				}
				
			}
			System.out.println("\n ("+cadena+")");
		}
		
		
		sc.close();
	}

}
