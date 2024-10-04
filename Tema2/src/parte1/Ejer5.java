package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos la variable a que servira para comparar dos numeros
		float a;
		// Creamos la variable b que servira para comparar dos numeros
		float b;
		// Creamos la variable c que servira para comparar dos numeros
		float c;
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		/* Le damos valor a las variables en base al input del usuario */
		a = lectura.nextFloat();
		b = lectura.nextFloat();
		c = lectura.nextFloat();
		if (a > b)
			System.out.print(a + " > ");
		else if (b > a)
			System.out.print(b + " > ");
		else
			System.out.print("Los numeros son iguales");

		// Cierre Scanner
		lectura.close();
	}

}
