package exercise4;

import java.util.Scanner;

public class EjFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numero;
		System.out.println("Dime un numero para que te calcule su factorial.");
		numero = sc.nextInt();
		long resultado=numero;
		
			for (long n=1;n<numero;numero--) {
				long resultadoP=resultado;
				resultado *= (numero-1);
				System.out.println(resultadoP+"*"+(numero-1)+" = "+resultado);
			}
		System.out.println("El factorial es: "+resultado);
	}
}
