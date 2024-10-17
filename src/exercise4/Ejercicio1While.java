package exercise4;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int numero;
		boolean certeza;
		String resultado;
		System.out.println("Dime algo.");
		cadena = sc.nextLine();

		while (!cadena.equalsIgnoreCase("salir")) {
			numero = cadena.length();
			certeza = numero % 2 == 0;
			resultado = certeza ? "Par" : "Impar";
			System.out.println(resultado+", vuelve a decirme una palabra o caracter.");
			cadena = sc.nextLine();
		}
		
		System.out.println("Fin.");
	}
}
