package parte6;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable entera numero que servira para guardar la informacion del
		// numero introducido por el usuario
		int numero;
		// Creamos la variable entera i que servira para controlar las veces que se
		// realiza el bucle y asi poder imprimir todos los numeros necesarios
		int i = 1;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que le indica que hace el programa al usuario
		System.out.println("Introduce un numero y te mostrare todos los numero desde 1 a n para que aprendas a contar");
		// Creamos un bucle for donde inicializamos la variable numero en funcion del
		// input del usuario, nuestra condicion sera que mientras i<=numero y la
		// iteracion del bucle sera aumentar el valor de i en +1
		for (numero = lectura.nextInt(); i <= numero; ++i) {
			// Print de todos los numeros desde 1 hasta el numero introducido por el usuario
			System.out.println(i);
			
		}
		//Cerramos el scanner
		lectura.close();
		
	}

}
