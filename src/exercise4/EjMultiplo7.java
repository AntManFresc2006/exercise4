package exercise4;

import java.util.Scanner;

public class EjMultiplo7 {

	public static void main(String[] args) {

		int num1, resto;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitame un numero y te dire si es multiplo de 7, en caso de que no lo sea te dire por cuantos numeros tienes sumarlo o restarlo.");

		num1 = sc.nextInt();

		resto = (num1 % 7);

		if (resto == 0) {

			System.out.println("Tu numero ya de por si es un multiplo de 7.");

		}
		
		

		else {

			System.out.println("Como "+num1+" no es multiplo de 7, tienes que sumarle "+(7-resto)+".");
			
			System.out.println("Por lo tanto, ese numero será: "+(num1+(7-resto))+".");
		}
	}

}
