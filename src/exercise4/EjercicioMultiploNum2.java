package exercise4;

import java.util.Scanner;

public class EjercicioMultiploNum2 {

	public static void main(String[] args) {
		int num1, num2, resto;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitame un numero.");

		num1 = sc.nextInt();
		
		System.out.println("Digitame otro numero y te dire si el anterior numero es multiplo de este, en caso de que no, te dire cuantos numeros necesita sumarlos para que si sea multiplo");

		num2 = sc.nextInt();

		resto = (num1 % num2);

		if (resto == 0) {

			System.out.println(num1+" ya es un multiplo de "+num2+".");

		}
		
		if(num1<num2) {
			
			System.out.println(num2+ " es un numero mayor que "+num1+", asi que "+num1+" no es un multiplo de "+num2+".");
		}

		if(num1>num2 && resto != 0) {

			System.out.println("Como "+num1+" no es multiplo de "+num2+", tienes que sumarle "+(num2-resto)+".");
			
			System.out.println("Por lo tanto, ese numero será: "+(num1+(num2-resto)+"."));
		}
		
		
	}

}
