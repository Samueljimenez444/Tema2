package parte6;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		//Creamos la variable numero que servira para almacenar el numero introducido por el usuario
		int numero = 0;
		//Creamos la variable tipo double suma que servira para calcular la suma de los distintos numeros introducidos por el usuario (es tipo double para conseguir imprimir una media con decimales)
		double suma = 0.0;
		//Creamos la variable tipo double media que servira para calcular la media total de los 10 numeros introducidos por los usuario (es tipo double para conseguir imprimir una media con decimales)
		double media=0.0;
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Creamo un bucle for donde inicializamos la variable i en 1, este bucle se repetira mientras i<=10 y por cada bloque de instrucciones que se ejecute el valor de i incrementara en 1
		for (int i=1; i <= 10; i++) {
			
			System.out.println("Introduzca un numero (Seran 10 veces)");
			//Definimos numero en funcion del input introucido por el usuario
			numero = lectura.nextInt();
			//Suma es igual a la suma de los distintos numeros
			suma += numero;
		}
		//Calculo de la media total de los 10 numeros introducidos
		media = suma /10;
		//Print del resultado
		System.out.println("La media es igual a " +media);
		//Cierre Scanner
		lectura.close();
	}
}
