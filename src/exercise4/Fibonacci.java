package exercise4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=1;
		int resultado = 0;
		int limit;
		System.out.println("Esta es la famosa sucesion de Fibonacci, dime hasta que numero quieres acabar esta sucesion.");
		limit = sc.nextInt();

		do {
			resultado += numero;
			System.out.println(resultado);
			resultado += numero;
			System.out.println(resultado);
		} while (resultado < limit);
		
	}
}
