package exercise4;

import java.util.Scanner;

public class EjArrays {

	public static void main(String[] args) {

		
		// edad.length para saber la longitud de un array
		//edades[0] para saber un numero en la posicion 0 del array.
		// se puede declarar una tabla de 2 formas: (tipo de dato) Int[] numeros= new int[5] (5 vendria siendo la longitud del array).
		//int numeros[] = {1,2,3,4,5} para declarar nuestro array. Esta es la segunda forma.
		
		int numeros[] = {1, 2, 3, 4, 5};
		System.out.println(numeros[2]); 
		//Aqui me devolvera 3 porque esta en la segunda posicion.
		
		String palabra[] = {"hola", "adios", "como estas"};
		System.out.println(palabra[0]);
		//Aqui ocurre lo mismo pero con Strings.
		System.out.println("Voy a cambiar el numero del array numeros en la posicion 2, si antes era 3, ahora será...");
		numeros[2] = 69;
		System.out.println(numeros[2]+".");
	} 
}
