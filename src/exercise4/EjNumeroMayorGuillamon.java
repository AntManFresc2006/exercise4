package exercise4;

import java.util.Scanner;

public class EjNumeroMayorGuillamon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int segundoNumero;
		int controlador=0;
		
		do {
			System.out.println("Dime un numero, introduce 0 si quieres acabar este programa.");
			numero=sc.nextInt();
			if(numero!=0 && controlador<numero) {
				controlador=numero;
			}
		}while(numero!=0);

		System.out.println("El numero mas granden introducido es: "+controlador);
	}
}
