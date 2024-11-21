package exercise4;

import java.util.Scanner;

public class EjBinarioDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero;
		int lectura;
		char posicion;
		int suma = 0;
		int potencia = 0;
		String sumas = ""; // hola
		System.out.println(
				"Dime un numero binario, si introduces cualquier numero que no sea 1 o 0, el programa introducira un numero erroneo.");
		numero = sc.nextLine();
		lectura = numero.length();

		do {
			int operacion = 1;
			--lectura;
			posicion = numero.charAt(lectura);

			switch (posicion) {
			case '1':

				if (potencia == 0) {
					operacion = 1;
				}
				for (int i = 0; i < potencia; i++) {
					operacion = operacion * 2;
				}
				System.out.println(2 + "*" + potencia + " = " + operacion);

				break;
			case '0':
				operacion = 0;
				break;
			default:
				System.out.println("Error.");
			}
			++potencia;
			suma += operacion;

			if (operacion > 0) {
				sumas += operacion + " + ";
			}

		} while (0 < lectura && (posicion == '1' || posicion == '0'));
		System.out.println(sumas + " = " + suma);

		System.out.println("Tu numero convertido a binario es: " + suma);
	}
}