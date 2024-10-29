package parte7;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		int numero;
		int division = 1;
		int cifras = 0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca un numero y te dire cuantas cifras tiene");
		numero = lectura.nextInt();
		do {
			cifras++;
		division=numero / 10;
		}while (division != 0);
		System.out.println(cifras);
	}

}
