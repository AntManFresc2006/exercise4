package exercise4;

import java.util.Scanner;

public class EjDescomprimir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int cantidad;
		int lectura = 0;
		char letras;
		
		System.out.println("Dime una palabra y te imprimire por separado cada letra que contiene.");
		cadena = sc.nextLine();
		cantidad = cadena.length();
		
		do {
			letras = cadena.charAt(lectura);
			System.out.println(letras);
			++lectura;
			
		} while (lectura < cadena.length());
		
		if (lectura == cadena.length()) {
			
			
			
			System.out.println("Fin.");
		}
		
		

	}
}
