package exercise4;

import java.util.Scanner;

public class Ej4WhileGuillamon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int lectura;
		final String caracteres = "abcdefghijklmnñopqrstuvwxyz";
		int segundalectura = caracteres.length();
		char segundocaracter;
		char caracter;
		String cadenaFinal = "";
		System.out.println("Dime una palabra y te convertire todas las mayusculas en minusculas.");
		cadena=sc.nextLine();
		lectura = cadena.length();
		do {
			--lectura;
			caracter = cadena.charAt(lectura);
			do {
				--segundalectura;
				 segundocaracter = caracteres.charAt(segundalectura);
				 if (caracter != segundocaracter) {
					 caracter = 32;
					 cadenaFinal += caracter;
				 }
			} while(segundalectura>0);
			
		}
		while(lectura > 0);
		
System.out.println(cadenaFinal);
	}
}
