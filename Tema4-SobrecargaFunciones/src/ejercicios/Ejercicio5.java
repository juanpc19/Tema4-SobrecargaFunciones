package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	static void numerosAleatorios (int iteraciones) {
		for (int i=1; i<=iteraciones; i++) {
			System.out.println(Math.random());
		}
	}
	
	static void numerosAleatorios (int iteraciones, int maximo) {
		
		int numero;
		
		for (int i=1; i<=iteraciones; i++) {
			
			numero = (int) (Math.random()*maximo);
			
			if (numero>maximo) {
				System.out.println(maximo);
				
				} else {
					System.out.println(numero);
			}
		}
	}
	
	static void numerosAleatorios (int iteraciones, int minimo, int maximo) {
		
		int numero;
		
		for (int i=1; i<=iteraciones; i++) {
				
			numero = (int) (Math.random()*maximo);
				
			if (numero>maximo) {
				System.out.println(maximo);
					
				} else if (numero<minimo) {
					System.out.println(minimo);
					
					} else {
					System.out.println(numero);
				}
		}
	}
	
	public static void main(String[] args) {

		int numeroIntroducido;
		
		int numeroIntroducido2;
		
		int numeroIntroducido3;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		numerosAleatorios (numeroIntroducido);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		numerosAleatorios (numeroIntroducido, numeroIntroducido2);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("Introduzca segundo numero entero: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		System.out.println("Introduzca tercer numero entero: ");
		
		numeroIntroducido3 = dogma.nextInt();
		
		numerosAleatorios (numeroIntroducido, numeroIntroducido2, numeroIntroducido3);
		
		dogma.close();

	}

}
