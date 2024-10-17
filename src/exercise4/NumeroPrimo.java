package exercise4;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String opcion;
		
		System.out.println("Dime un numero, te dire si es primo o compuesto.");
		
		do {
			System.out.println("Dime un numero");
			numero=sc.nextInt();
			if (numero%2!=0 && numero!=2 && numero%3!=0 && numero%5!=0) {
				System.out.println("Numero primo.");
			}
			else if (numero==2) {
				System.out.println("Numero primo.");
			}
			else if (numero==3) {
				System.out.println("Numero primo.");
			} //hola
			else if (numero==5) {
				System.out.println("Numero primo.");
			}
			else {
				System.out.println("Numero compuesto.");
			}
			
		} while(numero>-1);
	}
}
