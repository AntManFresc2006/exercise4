package exercise4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long fibonacci[] = new long[30];
		System.out.println("Hasta que numero quieres empezar.");
		fibonacci[0] = sc.nextInt();

		for (int i = 2; i<30; i++) {
			 fibonacci[i] = fibonacci [i-1] + fibonacci[i-2];
			 System.out.println(fibonacci[i]+ " = " +fibonacci [i-1]+" + "+fibonacci[i-2]+".");
		}
	}
}
