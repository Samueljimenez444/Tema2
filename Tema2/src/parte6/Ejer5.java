package parte6;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creamos la variable multiplicacion donde iremos calculando el valor del
		// factorial
		int multiplicacion=1;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Creamos un bucle for donde inicializamos la variable en funcion del input del usuario, el bucle finalizara cuando i<=0 e iremos decrementando en uno el numero introducido
		for (int i=lectura.nextInt(); i>0; i--) {
			//Multiplicacion es igual al numero introducido multiplicado multiples veces
			multiplicacion *= i;
		}
		//Print del resultado del factorial
		System.out.println("El resultado del factorial es igual a: " +multiplicacion);
		//Cierre Scanner
		lectura.close();
	}

}
