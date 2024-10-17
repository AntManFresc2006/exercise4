package exercise4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		int a, b, c, x;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Dada la ecuacion: y= ax*2 + bx + c, debera imprimirme los valores de las incognitas a, b, c y x.");

		System.out.println("Imprime el valor de a.");

		a = sc.nextInt();

		System.out.println("Imprime el valor de b.");

		b = sc.nextInt();

		System.out.println("Imprime el valor de c.");

		c = sc.nextInt();

		System.out.println("Imprime el valor de x.");

		x = sc.nextInt();

		sc.close();

		System.out.println("y= " + ((a * x * x) + (b * x) + (c)) + ".");

	}

}
