package exercise4;

import java.util.Scanner;

public class EjArrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion;
		String tabla = "";
		String impares = "";
		String pares = "";
		
		System.out.println(
				"Hola, este es un programa para crear filas ordenadas de numeros, primero, dime de cuanta longitud será tu fila.");
		eleccion = sc.nextInt();
		int numeros[] = new int[eleccion];

		System.out.println(
				"\nAhora para rellenar la lista tienes que introducir numeros, asi que pon los numeros que quieras.");

		for (int n = 0; n < eleccion; n++) {
			System.out.println("\nDime el numero en la posicion " + (n+1));
			int valor = sc.nextInt();
			numeros[n] = valor;
			if (n == 0) {
				tabla += "{" + valor;
			} else {
				tabla += ", " + valor;
			}

		}
		System.out.println("\nLista ordenada de numeros introducidos: "+tabla+"}");
		for (int i = 0; i < eleccion; i++) {
			if (numeros[i] % 2 == 0) {
				if (i == 0 && (numeros[i] < 0 || numeros[i] > 0)) {
					pares += numeros[i] + ", ";
				} 
				else if (i > 0 && (numeros[i] < 0 || numeros[i] > 0) && ((i < numeros.length) || (i < numeros.length-1))) {
					pares += numeros[i] + ", ";
				}
				
				else if (i > 0 && (numeros[i] < 0 || numeros[i] > 0) && ((i == numeros.length) || (i == numeros.length-1))) {
					pares += numeros[i];
				}

			} else if (numeros[i] % 2 == 1) {
				
				if (i == 0 && (numeros[i] < 0 || numeros[i] > 0)) {
					impares += numeros[i] + ", ";
				} else if (i > 0 && (numeros[i] < 0 || numeros[i] > 0) && ((i < numeros.length) || (i < numeros.length-1))) {
					impares += numeros[i] + ", ";
				}
				else if (i > 0 && (numeros[i] < 0 || numeros[i] > 0) && ((i == numeros.length) || (i == numeros.length-1))) {
					impares += numeros[i];
				}
			}
		}
		sc.close();

		System.out.println("\nLista de numeros pares: {"+pares+"}");
		System.out.println("\nLista de numeros impares: {"+impares+"}");
	}
}
