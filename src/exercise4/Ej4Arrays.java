package exercise4;

import java.util.Scanner;

public class Ej4Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int min = 0;
		int rango = (max - min) + 1;
		int caja[] = new int[5];
		String conjunto = "";
		int suma = 0;
		float media = 0;

		for (int i = 0; i < caja.length; i++) {
			int random = (int) (rango * Math.random());
			caja[i] = random;
			conjunto += random + ", ";
			suma += random;
			media++;
			for (int j=0;j<caja.length;j++) {
				int comparador = caja[j];
				if (comparador == random) {
					random = (int) (rango * Math.random());
					j=0;
				}
					else {
						conjunto += random + ", ";
				}
			}
			
		}

		System.out.println("{" + conjunto + "}");
		
		System.out.println("La suma de todos los numeros es: " + suma);
		
		System.out.println("La media de todos los numeros son: " + suma / media);
		
		int mayor = caja[0];
		
		int menor = caja[0];
		
		for (int n = 0; n < caja.length; n++) {
			mayor = caja[n] > mayor ? caja[n] : mayor;
			menor = caja[n] < menor ? caja[n] : menor;
		}
		System.out.println("El numero mas grande escogido aleatoriamente es: " + mayor);
		
		System.out.println("El numero mas pequeño escogido aleatoriamente es: " + menor);

	}
}
