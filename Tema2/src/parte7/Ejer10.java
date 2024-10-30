package parte7;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Creamos la variable entera numero que servira para almacenar el numero del
		// usuario
		int numero;
		//Creamos la variable entera resto que servira
		int resto = 1;
		//Creamos la variable division que servira para ir acortando el valor del numero por cada iteracion del bucle y asi ir recogiendo sus cifras en la varible resto
		int division = 1;
		//Creamos la variable entera capicua que servira para crear el numero espej del original 
		int capicua = 0;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print que le indica al usuario que hacer
		System.out.println("Introduce un numero y te dire si es capicua o no");
		// Definimos la variable numero en funcion del input del usuario
		numero = lectura.nextInt();
		// Mientrsa numero<0
		while (numero < 0) {
			// Se le pedira al usuario que introduzca un numero correcto
			System.out.println("Introduce un numero correcto");
			// Definimos la variable numero en funcion del input
			numero = lectura.nextInt();
		}
		//Division sera igual a numero para poder comparar numero sin necesidad de modificar la variable original
		division=numero;
		// Creamos un bucle do-while donde
		do {
			//Con esta operacion nos quedamos con una de las cifras del numero
			resto = division% 10;
			//Vamos recortando las cifras del numero poco a poco
			division/=10;
			//Definimos el valor de capicua 
			capicua = capicua*10+ resto;
			//Este bucle se repetira mientras division sea distitno a 0
		} while (division!= 0);
		//Si el numero espejo es iugal al origianl
		if(numero==capicua){
			//Print del resultado
			System.out.println("El numero es capicua");
		}
		//Si no se mostrara la otra opcion
		else
			System.out.println("El numero no es capicua");
		
		lectura.close();
	}
}
