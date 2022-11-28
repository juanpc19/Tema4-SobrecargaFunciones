package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	static int sumaEnteros (int num1) {
		int resultado = 0;
		for (int i=1; i<=num1; i++) {
			resultado += i;
		}	
		return (resultado);
	}
	
	static int sumaEnteros (int num1, int num2) {
		int resultado = 0;
		for (int i=num1; i<=num2; i++) {
			resultado += i;
		}	
		return (resultado);
	}

	public static void main(String[] args) {
		 
		int numeroEntero;
		
		int numeroEntero2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroEntero = dogma.nextInt();
		
		System.out.println("La suma de todos los números desde 1 hasta el numero introducido es: " + sumaEnteros (numeroEntero));
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroEntero = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroEntero2 = dogma.nextInt();
		
		if (numeroEntero<numeroEntero2 ) {
		
		System.out.println("La suma de todos los números entre los numeros introducidos es: " + sumaEnteros (numeroEntero, numeroEntero2));
		} else {
			System.out.println("La suma de todos los números entre los numeros introducidos es: " + sumaEnteros (numeroEntero2, numeroEntero));

		}
		
		dogma.close();

	}

}
