package exercise4;

import java.util.Scanner;

public class EntradasParque {

	public static void main(String[] args) {
		int entradasinfantiles, entradasadultas;
		double total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al parque acuatico de Aquopolis, hay 2 tipos de entrada, las entradas de adultos con un valor de 20 euros, y las infantiles con un valor de 15,5 euros.");
		
		System.out.println("Introduzca a continuacion la cantidad de entradas infantiles que va a comprar.");
		
		entradasinfantiles = sc.nextInt();
		
		System.out.println("Introduzca a continuacion la cantidad de entradas adultas que va a comprar.");
		entradasadultas = sc.nextInt();
		
		sc.close();
		
		total = (entradasinfantiles*15.5) + (entradasadultas*20);
		
		if (total>100 || total == 100) {
			
			System.out.println("El importe será de: "+(total-(total*0.05))+" euros.");
			
		}
		
		else {
			
			System.out.println("El importe será de: "+total+" euros.");
		}
			
			
		
		
	}

}
