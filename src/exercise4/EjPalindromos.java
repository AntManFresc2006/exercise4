package exercise4;

import java.util.Scanner;

public class EjPalindromos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		String otraCadena = "";
		int total; //hola
		char controlador;
		boolean certeza;
		String resultado;
		System.out.println("Dime una palabra y te dire si es un palindromo.");
		cadena = sc.nextLine();
		total = cadena.length();
		
		do {
			--total;
			controlador = cadena.charAt(total);
			otraCadena += controlador;
			
		} while (total >= 1);
		
		System.out.println(otraCadena);
		
		certeza = cadena.equalsIgnoreCase(otraCadena);
		resultado = certeza ? "Palindromo.": "No es palindromo.";
		System.out.println(resultado);
		

	}
}
