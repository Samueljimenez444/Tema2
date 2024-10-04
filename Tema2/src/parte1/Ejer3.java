package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos variable numero que servira para saber si ese numero introducido es
		// nulo o no
		float numero;
		// Creamos constante tipo float que restara 0,5 a los numeros para saber si son
		// o no casi nulos
		final float NUMEROTEST = (float) 0.5;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Le da valor a la variable numero en funcion del input del usuario
		numero = lectura.nextFloat();
		/*
		 * Creacion linea condicionales donde si el numero-0,5>1 el numero sera nulo,
		 * por otra parte si la primera afirmacion es falsa y numero-0,5<-1 el numero
		 * sera casi nulo, si el numero introducido es 0 se mostrara al usuario y por
		 * ultimo si todo esto es falso el numero no sera casi nulo
		 */
		if (numero - NUMEROTEST > 1)
			System.out.println("El numero no es numero casi nulo");
		else if (numero - NUMEROTEST < -1) {
			System.out.println("El numero no es numero casi nulo");
		} else if (numero == 0)
			System.out.println("El numero no es un numero casi nulo (es 0)");
		else
			System.out.println("El numero es un numero casi nulo");
		// Cierra Scanner
		lectura.close();
	}

}
