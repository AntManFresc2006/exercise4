/*package ejercicios;
import java.util.Scanner;
public class Ej4Arrays {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int max = 5;
			int min= 1;
			int rango = (max-min)+1;
			int caja[] = new int[5];
			String conjunto = "";
			int suma = 0;
			float media=0;
			int iterator=caja.length-1;
			
			
			for (int i=0; i<caja.length; i++) {
				int numeroRandom = (int) (rango* Math.random());
				caja[i] = numeroRandom;
				System.out.println(numeroRandom);
				conjunto+=numeroRandom+", ";
				suma+=numeroRandom;
				media++;
					
			}
			/*do {
				for (int n=0;n<caja.length;n++) {
					int numeroRandom = (int) (rango* Math.random());
					while (caja[iterator] == numeroRandom)
						{
							numeroRandom = (int) (rango* Math.random());
							
						}
					caja[n] = numeroRandom;
						
					}
					iterator--;
			}
			while (iterator>=0);
			
				
			
			
			int mayor=caja[0];
			int menor=caja[0];
			for (int n=0;n<caja.length;n++) {
				mayor = caja[n] > mayor ? caja[n] : mayor;
				menor = caja[n] < menor ? caja[n] : menor;
			}
			System.out.println("El numero mas grande escogido aleatoriamente es: " +mayor);
			System.out.println("El numero mas pequeño escogido aleatoriamente es: "+menor);
			System.out.println("{"+conjunto+"}");
			System.out.println("La media de todos los numeros son: "+suma/media);
			
			
		}

	}
*/