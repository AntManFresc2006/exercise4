package ejercicios;

import java.util.Scanner;

public class Contraseña {
	public static void main (String  [] args) {
	Scanner sc = new Scanner(System.in);
	
	String[] contraseña = new String[20];
	String[] contrana = new String[20];
	int opcion;
	int caja = -1;
	int contador = -1;
	String palabra;
	int opcionDos;
	
	do {
		System.out.println("Empesemo ete pograma :D");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			caja++;
			System.out.println("Dime una contraseña.");
			sc.nextLine();
			contraseña [caja] = sc.nextLine();
			System.out.println("Tu contraseña es "+contraseña[caja]+", no e asin? bonita contraseña :D");
			break;
		case 2:
			palabra = "";
			char variador;
			char letra = '';
			contador++;
			contrana[contador] = "";
			System.out.println("Digame ute que contraseña kiele cambial :)");
			opcionDos = sc.nextInt();
			palabra += contraseña[opcionDos-1];
			for (int i = 0; i<palabra.length(); i++) {
				variador = (palabra.charAt(i));
				letra = variador + '3';
				contrana[contador] += variador;
			}
			break;
		case 0: 
			System.out.println("Fin del pograma :)");
			break;
		default:
			System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO >:(");
			break;
		}
		
			
	} while (opcion != 0);
}
}
