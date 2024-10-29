package parte7;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		//Creamos la variable entera numero que servira para almacenar el numero introducido por el usuario
		int numero;
		//Creamos la variable entera errores que servira para contabilizar el numero de "errores" que comete el usuario
		int errores = 0;
		//Creamos la variable entera introducidos que servira para almacenar cuantos numeros ha introducido el usuario
		int introducidos = 1;
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Le preguntamos al usuario por un input
		System.out.println("Dime un numero");
		//Definimos la variable numero en funcion del input del usuario
		numero = lectura.nextInt();
		//Creamos un bucle for donde la varable i= al numero introducido por el usuario, el bucle se detendra cuando i==0 y por cada iteracion el bucle incrementara en +1
		for (int i = numero; i != 0; i++) {
			//Print que le indica al usuario que me introduzca otro nuemro
			System.out.println("Dime un numero");
			//Volvemos a definir la variable numero en funcion del numero del usuario
			numero = lectura.nextInt();
			//Creamos un condicional if donde si numero==0 el bucle finalizara
			if (numero == 0)
				break;
			//Creamos un condicional if donde si el i>numero el numero introducido sera menor por lo que  
			if (i > numero) {
				//Se incrementara el valor de error en 1 ya ue el usuario ha cometido un error
				errores++;
				//Print que le da indicaciones al usuario
				
				System.out.println("Error el numero introducido es menor");
				//definimos la variable i
				i = numero;
				//Introducidos incrementa en 1 para contabilizar los numero introducidos por el usaurio
				introducidos++;
				//Creamos un condicional else if donde si i<numero
			} else if (i < numero && numero!=0) {
				//El numero de numeros introducidos incrementara en 1
				introducidos++;
			}
		}
		/*Print del numero de errores y numeros introducidos por el usuario*/
		System.out.println("Has cometido en total: " + errores + " errores");
		System.out.println("Has introducido en total: " + introducidos + " numeros");
		//Cierre Scanner
		lectura.close();
	}
}
