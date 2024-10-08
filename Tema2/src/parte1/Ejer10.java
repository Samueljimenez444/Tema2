package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		//Creamos la variable numero1 que servira para coomprobar si la suma de dos numeros es igual a otro numero introducido por el usuario
		int numero1;
		//Creamos la variable numero2 que servira para coomprobar si la suma de dos numeros es igual a otro numero introducido por el usuario
		int numero2;
		//Creamos la variable numero3 que servira para coomprobar si la suma de dos numeros es igual a otro numero introducido por el usuario
		int numero3;
		//Creamos la variable suma1 que sirve para realizar la suma de los numeros 1 y 2 para asi conocer si la suma de estos dos da como resultado el numero 3
		int suma1;
		//Creamos la variable suma1 que sirve para realizar la suma de los numeros 1 y 3 para asi conocer si la suma de estos dos da como resultado el numero 2
		int suma2;
		//Creamos la variable suma1 que sirve para realizar la suma de los numeros 2 y 3 para asi conocer si la suma de estos dos da como resultado el numero 1
		int suma3;
		//Creacion del objeto Scanner que leera los datos introducidos por el usuario
		Scanner lectura = new Scanner(System.in);
		/*Definimos los valores de los numero1,numero2 y numero3 con el input del usuario*/
		System.out.println("Introduce un numero");
		numero1 = lectura.nextInt();
		System.out.println("Introduce otro numero");
		numero2 = lectura.nextInt();
		System.out.println("Introduce otro numero");
		numero3 = lectura.nextInt();
		/*Definimos las 3 sumas realizando la operacion aritmetica para posteriormente utilizarla junto a un condicional*/
		suma1 = numero1 + numero2;
		suma2 = numero1 + numero3;
		suma3 = numero2 + numero3;
		/*Creamos una sentencia condicional donde si la suma de dos numeros es igual a alguno de los numeros introducidos por el usuario se printee en la pantalla este dato, por otra parte si esta condicion no se cumple se le informara al usuario de esto*/
		if (suma1==numero3||suma2 == numero2 ||suma3 == numero1)
			System.out.println("La suma de dos numeros da como resultado otro de esos numeros");
		else
			System.out.println("Ninguna suma de dos numeros da lugar a otro");
	}

}
