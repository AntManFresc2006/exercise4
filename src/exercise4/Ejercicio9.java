package exercise4;

import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int edad;
		boolean mayorDeEdad;
		String resultados;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime cuantos años tienes.");
		
		edad = entrada.nextInt();
		
		entrada.close(); //esto sirve para cerrar el scanner
		
		mayorDeEdad = edad>=18; //Aqui ocurre nuestro boolean
		resultados = mayorDeEdad ? "Eres mayor de edad": "Eres menor de edad"; //Aqui imprimimos lo que dice nuestro true y false
		
		System.out.println(resultados); //Aqui imprimimos lo que dira nuestro "True" o "False".
		
	}
}
