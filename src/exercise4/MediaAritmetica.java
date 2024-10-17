package exercise4;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		float primeraNota, segundaNota, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Imprima su primer numero");
		
		primeraNota = entrada.nextFloat();
		
		System.out.println("Ahora el segundo, y despues imprimire la media aritmetica entre esos 2 numeros.");
		
		segundaNota = entrada.nextFloat();
		
		media = (primeraNota + segundaNota) / 2;
		
		System.out.println("Tu nota final es: "+media);
		
		

	}

}
