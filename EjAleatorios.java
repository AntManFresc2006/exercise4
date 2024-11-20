package exercise4;

import java.util.Scanner;

public class EjAleatorios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, cantidad, texto, total;
	String palabra;
		
		
		do {

			System.out.println("Pulsa '1' si quieres empezar este programa, pulsa '0' si quieres acabar.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Dime el tamaño que quieres que tenga la tabla.");

				cantidad = sc.nextInt();
				int[] tabla = new int[cantidad];
				int [] nuevaTabla = tablaNumeros(tabla, cantidad);
				System.out.println("Tu tabla es... " + nuevaTabla + ".");
				break;
			case 0:
				System.out.println("Adios.");
				break;
			default:
				System.out.println("Error, vuelve a intentarlo.");
				break;
			}

		} while (opcion != 0);

		sc.close();

	}

	public static int[] tablaNumeros(int[] tabla, int cantidad) {
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;
		for (int i = 0; i < cantidad; i++) {
			int random = (int) ((range * Math.random()) + min);
			System.out.println(random);
			tabla[i] = random;
		}
		return tabla;
	}
	
	public static void cadena(int[] tabla, int cantidad, String texto, String palabra) {
		texto = "";
		for (int n=0;n<cantidad;n++) {
			texto += tabla[n];
		}
		palabra = "("+texto+")";
	}
	

}
