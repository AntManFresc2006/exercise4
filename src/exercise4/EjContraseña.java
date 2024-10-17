package exercise4;

import java.util.Scanner;

public class EjContraseña {

	public static void main(String[] args) {
		String contrasena1, contrasena2;
		boolean verificacion;
		String resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la contraseña que quieres usar para tu correo electrónico.");
		
		contrasena1 = sc.nextLine();
		
		System.out.println("Vuelve a meter la misma contraseña para verificar si te acuerdas de ella.");
		
		contrasena2 = sc.nextLine();
		
		sc.close();
		
		verificacion = contrasena1.equals(contrasena2);
		
		resultado = verificacion ? "Contrasena correcta.": "Contraseña incorrecta.";
		
		System.out.println(resultado);

	}

}
