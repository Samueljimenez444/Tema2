package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Creacion variable numero que servira para ver las cifras del numero
		// introducido
		int numero;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que indica al usuario que hacer
		System.out.println("Introduzca un numero entre 0 y 99999");
		// Definimos la variable numero en base al input del usuario
		numero = lectura.nextInt();
		/*
		 * Sucesion de condicionales que indican el numero de cifras comparando el
		 * numero introducido con el primer numero de esas cifras, si el numero
		 * introducido no se encuentra entre 0 y 99999 el programa indicara que se debe
		 * introducir otra vez un numero
		 */
		if (numero < 10)
			System.out.println("El numero tiene 1 cifra");
		else if (numero < 100)
			System.out.println("El numero tiene 2 cifra");
		else if (numero < 1000)
			System.out.println("El numero tiene 3 cifra");
		else if (numero < 10000)
			System.out.println("El numero tiene 4 cifra");
		else if (numero < 100000)
			System.out.println("El numero tiene 5 cifra");
		else if (numero < 0)
			System.out.println("Introduzca un numero entre 0 y 9999");
		else
			System.out.println("Introduzca un numero entre 0 y 9999");
		// Cierre Scanner
		lectura.close();

	}

}
