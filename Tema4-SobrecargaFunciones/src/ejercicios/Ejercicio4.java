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
		
	static String parseToBoolean (String palabra) {
		boolean respuesta=false;
		if palabra.equalstrue {
			respuesta=true;
		}
		return (respuesta);
	}

	public static void main(String[] args) {

		int numeroIntroducido;
		
		String palabra = "";
		
		Scanner dogma= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero, 0 o 1: ");

		numeroIntroducido = dogma.nextInt();
		
		System.out.println(parseToBoolean(numeroIntroducido)? "El numero introducido es: 1. " : "El numero introducido es: 0.");

		System.out.println("Introduzca una palabra: ");

		palabra = dogma.nextLine();
		
		System.out.println(parseToBoolean(numeroIntroducido)? "El numero introducido es: 1. " : "El numero introducido es: 0.");

		dogma.close();
		
	}

}
