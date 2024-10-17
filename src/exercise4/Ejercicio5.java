package exercise4;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		double num1, num2, suma, resta, multiplicacion, division;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		
		num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		
		num2 = entrada.nextInt();
		
		entrada.close();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1*num2;
		division = num1/num2;
		
		System.out.println("El valor resultante de la suma de los numeros ingresados es: "+suma);
		System.out.println("El valor resultante de la resta de los numeros ingresados es: "+resta);
		System.out.println("El valor resultante de la multiplicacion de los numeros ingresados es: "+multiplicacion);
		System.out.println("El valor resultante de la division de los numeros ingresados es: "+division);

	}

}
