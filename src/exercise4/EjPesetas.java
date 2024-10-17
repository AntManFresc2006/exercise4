package exercise4;
//
import java.util.Scanner;
public class EjPesetas {

	public static void main(String[] args) {
		float valorEnPesetas, valorEnEuros;
		int eleccion;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Saludos, este es un conversor de pesetas a euros y viceversa, pulse 0 si quiere usar pesetas y pulse 1 si quiere usar euros.");
		
		eleccion = entrada.nextInt();
		
		if (eleccion == 0) {
			
			System.out.println("Esta bien, ahora añade a continuacion la cantidad de pesetas que quieres introducir para luego pasarlas a euros.");
			
			valorEnPesetas = entrada.nextInt();
			
			System.out.println("Tienes un valor de: "+valorEnPesetas/166+" euros.");
		}
		
		if (eleccion == 1) {
			
			System.out.println("Esta bien, ahora añade a continuacion la cantidad de euros que quieres introducir para luego pasarlos a pesetas.");

			valorEnEuros = entrada.nextInt();
			
			System.out.println("Tienes un valor de: "+valorEnEuros*166+" pesetas.");
	}

}
}
