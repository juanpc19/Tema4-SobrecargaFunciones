package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	static double media (int num1, int num2) {
		double resultado = (num1 + num2)/2;
		return (resultado);
	}
	
	static double media (int num1, int num2, int num3) {
		double resultado = (num1 + num2 +  num3)/3;
		return (resultado);
	}
	
	
	public static void main(String[] args) {
		 
		int numeroEntero;
		
		int numeroEntero2;
		
		int numeroEntero3;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroEntero = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroEntero2 = dogma.nextInt();
		
		System.out.println("La media de los numeros introducidos es: " + media (numeroEntero, numeroEntero2));
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroEntero = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroEntero2 = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroEntero3 = dogma.nextInt();
		
		System.out.println("La media de los numeros introducidos es: " + media (numeroEntero, numeroEntero2, numeroEntero3));
	
		dogma.close();

	}

}
