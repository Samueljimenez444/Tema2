package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creacion variable numero que sera utilizada para declarar la nota del alumno

		float numero;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que indica las ordenes al usuario
		System.out.println("Introduce la nota del alumno");
		// Declaramos el valor de numero en base al input del usuario
		numero = lectura.nextFloat();
		/*
		 * Sucesion de condicionales que printearan la nota final del alumno. Si
		 * numero<5 la nota sera insuficiente, si numero>=5 y numero<6 la nota sera
		 * suficiente, si numero<=6 y numero<7 la nota sera bien si numero>=7 y numero<9
		 * la nota sera notable y por ultimo si la nota>=9 y numero<=10 la nota sera
		 * sobresaliente, si el numero introducido no se encuentra dentro del rango
		 * [0,10] el programa indicara que se debe introducir una nota valida
		 */
		if (numero < 5)
			System.out.println("La nota del alumno es: Insuficiente");
		else if (numero >= 5 && numero < 6)
			System.out.println("La nota del alumno es: Suficiente");
		else if (numero >= 6 && numero < 7)
			System.out.println("La nota del alumno es: Bien");
		else if (numero >= 7 && numero < 9)
			System.out.println("La nota del alumno es: Notable");
		else if (numero >= 9 && numero <= 10)
			System.out.println("La nota del alumno es: Sobresaliente");
		else if (numero < 0)
			System.out.println("Introduzca una nota valida");
		else
			System.out.println("Introduzca una nota valida");
		// Cierre Scanner
		lectura.close();

	}

}
