package exercise4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String nombre, direccion;
		int telefono;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime tu nombre, direccion y tu numero de telefono");
		
		nombre = entrada.nextLine();
		direccion = entrada.nextLine();
		telefono = entrada.nextInt();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Nombre: "+direccion);
		System.out.println("Nombre: "+telefono);
		

	}

}
