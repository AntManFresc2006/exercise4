package exercise4;

import java.util.Scanner;

public class Ej4Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int min= 0;
		int rango = (max-min)+1;
		int caja[] = new int[10];
		String conjunto = "";
		int suma = 0;
		float media=0;
		
		
		for (int i=0; i<caja.length; i++) {
			int numeroRandom = (int) (rango* Math.random());
			caja[i] = numeroRandom;
			System.out.println(numeroRandom);
			conjunto+=numeroRandom+", ";
			suma+=numeroRandom;
			media++;
			
			int mayor=caja[0];
			int menor=caja[0];
			
			
			for (i=0;i<caja.length;i++) {
				mayor = caja[i] > mayor ? caja[i] : mayor;
				menor = caja[i] < menor ? caja[i] : menor;
			}
			System.out.println("{"+conjunto+"}");
			System.out.println("La media de todos los numeros son: "+suma/media);
			System.out.println("El numero mas grande escogido aleatoriamente es: " +mayor);
			System.out.println("El numero mas pequeño escogido aleatoriamente es: "+menor);
		}
		
		
	}
}
