package exercise4;

import java.util.Scanner;

public class EjNumeroBinarioGuillamon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero;
		int lectura;
		char posicion;
		int suma = 0;
		int operacion = 0;
		int potencia = 0; //hola

		System.out.println(
				"Este es un programa que convierte numeros binarios a decimal, ahora, introduce un numero binario.");
		System.out.println("Si introduces cualquier numero que no sea 1 o 0, el numero instantaneamente sera 0.");
		numero = sc.nextLine();
		lectura = numero.length();
		

		do {
			--lectura;
			posicion = numero.charAt(lectura);

			if (posicion == '1') {
				operacion = (int) (Math.pow(2, potencia));
			}
			else if (posicion == '0') {
				operacion = 0;
			}
			else {break;}
			
			++potencia;
			suma += operacion;
		} while (0 < lectura);

		System.out.println("Tu numero convertido a decimal es: " + suma);
	}
}
