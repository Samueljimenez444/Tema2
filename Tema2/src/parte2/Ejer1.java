package parte2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable nota que servira para calificar al alumno
		int nota;
		// Creamos el objeto scanner que leera los inputs del usuario
		Scanner lectura = new Scanner(System.in);
		// Print que le da las instrucciones al usuario
		System.out.println("Introduce la nota del aulumno");
		// Definimos la variable nota en funcion del input del usuario
		nota = lectura.nextInt();
		/*
		 * Creamos un condicional multiple switch que dependiendo de la nota mostrara
		 * una u otra calificacion, si la nota del alumno se encuentra entre [0,4]
		 * mostrara suspenso, si es de 5 suficiente, si es de 6 bien, entre [7,8]
		 * notable y si se encuentra entre [9,10] mostrara sobresaliente
		 */
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("Suspenso");
			System.out.println("Debe mejorar....");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bien");
		}
		case 7, 8 -> {
			System.out.println("Notable");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
		}
		default ->
			System.out.println("La calificacion mostrada es la que debe ser presentada en la evaluacion del alumno");
		}
		// Cerramos el Scanner
		lectura.close();
	}
}
