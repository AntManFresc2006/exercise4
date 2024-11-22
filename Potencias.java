package ejercicios;
import java.util.Scanner;
public class Potencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quieres empezar este programa?");
		String opcion = sc.nextLine();
		if (opcion.equalsIgnoreCase("si")) {
			do {
				int base;
				int potencia;
				int resultado = 1;
				System.out.println("Dime un numero.");
				base = sc.nextInt();
				System.out.println("Ahora dime la potencia a la que lo quieres elevar.");
				potencia = sc.nextInt();
				for (int i = 0; i < potencia; i++) {
					resultado = resultado * base;
				}
				System.out.println("El resultado de la operacion " + base + "*" + potencia + " es " + resultado + ".");
				System.out.println("Quieres seguir usando este programa?");
				sc.nextLine();
				opcion = sc.nextLine();
				if (opcion.equalsIgnoreCase("no")) {
					System.out.println("Fin del programa.");
				}
			} while (opcion.equalsIgnoreCase("si"));
		} else {
			System.out.println("Fin del programa.");
		}

	}

}
