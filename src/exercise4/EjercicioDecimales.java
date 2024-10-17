package exercise4;

import java.util.Scanner;

public class EjercicioDecimales {

	public static void main(String[] args) {
		float decimales;
		float enteros, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitame un numero con decimales y luego te lo aproximo al numero entero mas cercano a este.");
		
		decimales = sc.nextFloat();
		
		enteros = (int)decimales;
		
		resultado = (decimales-enteros);
		
		sc.close();
		
		if (resultado<0.5) {
			
			System.out.println("Digitame un numero con decimales y luego te lo ");
			
			
		}
		
		

	}

}
