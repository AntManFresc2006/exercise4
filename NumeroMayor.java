package ejercicios;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		System.out.println("Dime una palabra y te dire si su longitud es par o impar.");
		
		palabra = sc.nextLine();
		
		while (!palabra.equalsIgnoreCase("salir")) {
			if (palabra.length()%2==0) {
				System.out.println("Par.");
			}
			else {
				System.out.println("Impar.");
			}
			System.out.println("Dime una palabra y te dire si su longitud es par o impar.");
			palabra = sc.nextLine();
		}
		System.out.println("Fin del programa.");
		}

}
