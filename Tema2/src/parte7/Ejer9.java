package parte7;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		//Creamos la variable entera numero que nos servira para almacenar el numero introducido por el usuario
		int numero;
		//Creamos la variable entera divisioon que servira para ir dividiendo durante las repetidas iteraciones del bucle el numero entre 10 para asi ir "restando" cifras al numero
		int division = 1;
		//Creamos la variable entera cifras ques servira para contabilizar cuantas cifras tendra el numero introducido por el usuario
		int cifras = 0;
		//Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		//Print que le indica al usuario que debe hacer
		System.out.println("Introduzca un numero y te dire cuantas cifras tiene");
		//Definimos la varaible numero en funcion el input del usuario
		numero = lectura.nextInt();
		//Creamos un bucle do while donde
		do {
			//Por cada iteracion del bucle el valor de cifra aumenta en 1
			cifras++;
			//Division= numero/10
		division=numero/10;
		//numero= al resultado de la division asi el numero ira decreciendo en cifras urgentemente
		numero=division;
		//El bucle se repetira mientras division sea distinto a 0
		}while (division != 0);
		//Print del numero total de cifras del numero introducido por el usuario
		System.out.println("El numero introducido tiene "+cifras+ " cifras");
		lectura.close();
	}

}
