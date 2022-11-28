package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	static int suma (int num1, int num2) {
		int resultado = num1 + num2;
		return (resultado);
	}
	
	static double suma (double num1, double num2) {
		double resultado = num1 + num2;
		return (resultado);
	}


	public static void main(String[] args) {
		 
		int numeroEntero;
		
		int numeroEntero2;
		
		double numeroDecimal;
		
		double numeroDecimal2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroEntero = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroEntero2 = dogma.nextInt();
		
		System.out.println("La suma de los numeros enteros es: " + suma (numeroEntero, numeroEntero2));
		
		System.out.println("Introduzca un numero decimal: ");
		
		numeroDecimal = dogma.nextDouble();
		
		System.out.println("Introduzca otro numero decimal: ");
		
		numeroDecimal2 = dogma.nextDouble();
		
		System.out.println("La suma de los numeros decimales es: " + suma (numeroDecimal, numeroDecimal2));

		dogma.close();
	}

}
