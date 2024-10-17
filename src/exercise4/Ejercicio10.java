package exercise4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numerointroducido;
		int division;
		boolean resultadodivision;
		String resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digitame 1 numero y a continuacion te dire si es par o impar.");
		numerointroducido = entrada.nextInt();
		division = (numerointroducido % 2);
		resultadodivision = division <= 0;
		resultado = resultadodivision ? "tu numero es par" : "tu numero es impar";
		System.out.println(resultado);
		
		entrada.close();

	}

}
