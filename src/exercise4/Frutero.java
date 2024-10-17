package exercise4;

import java.util.Scanner; 
//Este programa es una aplicacion que imprimira en consola la cantidad de dinero obtenido por venta de peras y manzanas.
public class Frutero {

	public static void main(String[] args) {
		int perasVendidas, manzanasVendidas, total;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digame cuantos kilos de manzanas has vendido este año");
		
		manzanasVendidas = entrada.nextInt();
		
		System.out.println("Perfecto, ahora digame cuantos kilos de peras has vendido este año, a continuacion te mostrare el beneficio obtenido por peras y manzanas y luego la suma total.");
		
		perasVendidas = entrada.nextInt();
		
		entrada.close();
		
		total = (perasVendidas + manzanasVendidas);
		
		System.out.println("El beneficio anual obtenido de la venta de manzanas es de: "+manzanasVendidas*2.35+" euros.");
		System.out.println("El beneficio anual obtenido de la venta de peras es de: "+perasVendidas*1.95+" euros.");
		System.out.println("El beneficio anual obtenido de la venta de peras y manzanas es de: "+total*2.15+" euros.");
		
	
		

	}

}
