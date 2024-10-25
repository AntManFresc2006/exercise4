package exercise4;

import java.util.Scanner;

public class EjNumeroBinarioGuillamon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero;
		int lectura;
		char posicion;
		int suma = 0;
		int potencia = 0;

		System.out.println(
				"Dime un numero binario, si introduces cualquier numero que no sea 1 o 0, el programa introducira un numero erroneo.");
		numero = sc.nextLine();
		lectura = numero.length();

		do {
			int operacion = 1;
			--lectura;
			posicion = numero.charAt(lectura);

			if (posicion == '1') {
				if (potencia == 0) {
					operacion = 1;
				} else {
					for (int i = 0; i < potencia; i++) {
						operacion = operacion * 2;
					}
				}
				System.out.println(2 + "*" + potencia + " = " + operacion);
			} else if (posicion == '0') {
				operacion = 0;
			}

			++potencia;
			suma = suma + operacion;

		} while (0 < lectura && (posicion == '1' || posicion == '0'));

		System.out.println("Tu numero convertido a binario es: " + suma);
	}
}
