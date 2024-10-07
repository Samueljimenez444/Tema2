package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		float nota;
		float numero;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce la nota del alumno");
		numero = lectura.nextFloat();
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

	}

}
