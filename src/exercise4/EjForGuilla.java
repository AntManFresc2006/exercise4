package exercise4;

import java.util.Scanner;

public class EjForGuilla {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero;
		System.out.println("dime un numero del 0 al 100.");
		numero = sc.nextInt();
		int i;
		int contador=0;
		
		for (i=numero; i>=0; i-=2, ++contador) {
			if (i%2==1) {
				System.out.println(i-1);
			}
			else {
				System.out.println(i);
			}
			
			
		}
		System.out.println("Hay "+(contador-1)+" numeros pares contando desde "+numero+".");

	}
}
