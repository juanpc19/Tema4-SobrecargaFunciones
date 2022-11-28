package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static boolean parseToBoolean (int num1) {
		boolean respuesta=false;
		if (num1==1) {
			respuesta=true;
		}
		return (respuesta);
	}
		
	static String parseToBoolean (int num1) {
		boolean respuesta=false;
		if (num1==1) {
			respuesta=true;
		}
		return (respuesta);
	}

	public static void main(String[] args) {

		int numeroIntroducido;
		
		Scanner dogma= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero, 0 o 1: ");

		numeroIntroducido = dogma.nextInt();
		
		System.out.println("El numero introducido es: ");

		
	}

}
