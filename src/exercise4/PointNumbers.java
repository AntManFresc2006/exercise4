package Ejercicios;

import java.util.Scanner;

public class PointNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number;
		int cantidad; // olaaaa
		String finalo="";
		String finala="";
		System.out.println("Dime un numero. Si este es mayor que 1.000, le añadire puntos.");
		
		number = sc.nextLine();
		
		String[] numero = new String[number.length()];
		
		if (numero.length >= 0 && numero.length <= 3) {
			System.out.println(number);
		}
		
		if (numero.length-1%3 == 0) {
			for (int i = 0; i <= numero.length-1; i++) {
				if (i == 0) {
					finalo += number.charAt(i) + ".";
				}
				if (i%3==0){
					finalo += number.charAt(i) + ".";
				}
				if (i%3!=0) {
					finalo += number.charAt(i);
				}
				System.out.println(finalo);
			}
		}
		
		if (numero.length-1%4 == 0) {
			for (int n = 0; n <= numero.length-1; n++) {
				if (n == 1) {
					finalo += number.charAt(n) + ".";
				}
				if (n%3==0){
					finalo += number.charAt(n) + ".";
				}
				if (n%3!=0) {
					finalo += number.charAt(n);
				}
				System.out.println(finalo);
			}
		}
		if (numero.length-1%5 == 0) {
			for (int j = 0; j <= numero.length-1; j++) {
				if (j == 2) {
					finalo += number.charAt(j) + ".";
				}
				if (j%3==0){
					finalo += number.charAt(j) + ".";
				}
				if (j%3!=0) {
					finalo += number.charAt(j);
				}
				System.out.println(finalo);
			}
		}
			
System.out.println(finalo);
		
	}
	}

