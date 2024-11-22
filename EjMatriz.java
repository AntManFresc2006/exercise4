		package exercise4;

import java.util.Scanner;

public class EjMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion, sumaColumnas =0, sumaFilas=0;
		String palabraColumnas = "";
		String palabraFilas = "";
		String palabraDiagonal = "";
		String palabraDeterminantes = "";
		do {

			System.out.println("Pulsa '1' si quieres empezar este programa, pulsa '0' si quieres acabar.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				
				
				System.out.println("Tu tabla es... ");
				
				System.out.println("Dime la cantidad de filas que quiere que tenga tu matriz.");
				int filas = sc.nextInt();
				System.out.println("Dime la cantidad de columnas que quiere que tenga tu matriz.");
				int columnas = sc.nextInt();
				
				int[][] matriz = new int[filas][columnas];
				
				randoms (filas, columnas, matriz);
				
				filasRandoms(matriz);
				
				sumaFilas(matriz, columnas, filas, sumaFilas, palabraFilas);
				
				System.out.println("Ahora la suma de las columnas");
				
				sumaColumnas(matriz, columnas, filas, sumaColumnas, palabraColumnas);

				System.out.println("\nFin de la matriz.");
				break;
			case 0:
				System.out.println("\nAdios.");
				break;
			default:
				System.out.println("\nError, vuelve a intentarlo.");
				break;
			}

		} while (opcion != 0);

		sc.close();
	}

	public static int[][] randoms(int filas, int columnas, int[][] matriz) {
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;

		// Este es el for donde la matriz va a llenarse de numeros randoms
		for (int i = 0; i < columnas; i++) {
			
			for (int n = 0; n < filas; n++) {
				int random = (int) ((range * Math.random()) + min);
				
				matriz[i][n]= random;
			}
		}
		
		return matriz;
	}
	
	public static int[][] filasRandoms(int [][] matriz) {
		
		for (int j=0; j<matriz.length; j++) {
			for (int q=0; q<matriz[j].length;q++) {
				System.out.print(matriz[j][q]+"\t");
			}
			System.out.println("");
		}
		return matriz;
	}
	
public static int[][] sumaFilas(int [][] matriz, int columnas, int filas, int sumaFilas, String palabraFilas) {
		
		for (int i=0; i<filas; i++) {
			palabraFilas = "";
			sumaFilas = 0;
			for (int n=0; n<columnas; n++) {
				sumaFilas += matriz[i][n];
				if (n == filas-1) {
					palabraFilas += matriz[i][n];
				}
				else {
					palabraFilas +=  matriz[i][n]+" + ";
					
				}
				
			}
			
			System.out.println("\n Fila "+(i+1)+": "+palabraFilas+" = "+sumaFilas);
			
		}
		
		return matriz;
	}

public static int[][] sumaColumnas(int [][] matriz, int columnas, int filas, int sumaColumnas, String palabraColumnas) {
	
	for (int i=0; i<matriz[columnas-1].length; i++) {
		System.out.println("\nfila: "+i);
		palabraColumnas = "";
		sumaColumnas = 0;
		for (int n=0; n<matriz.length; n++) {
			System.out.println("\ncolumna: "+n);
			sumaColumnas += matriz[n][i];
			if (n == filas-1) {
				palabraColumnas += matriz[n][i];
			}
			else {
				palabraColumnas +=  matriz[n][i]+" + ";
				
			}
			
		}
		
		System.out.println("\n Columna "+(i+1)+": "+palabraColumnas+" = "+sumaColumnas);
		
	}
	
	return matriz;
}

}
