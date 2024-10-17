package exercise4;

import java.util.Scanner;
public class tema1 {

	public static void main(String[] args) {
		
		double radio, longitud, area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Buenos dias, este programa esta diseñado para calcular la longitud y circunferencia de una esfera a traves de su radio, por favor, introduzca el valor del radio de la circunferencia.");
		
		radio = entrada.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * radio * radio;
		
		System.out.println("Su longitud es de: "+longitud+" unidades.");
		System.out.println("Su area es de: "+area+" unidades.");
		
		entrada.close();
		
		

	}

}
