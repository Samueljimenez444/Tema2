package parte7;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		int numero;
		Scanner lectura = new Scanner(System.in);
		numero = lectura.nextInt();
		for (int i = 1; i < numero; i++) {
			if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 ) {
				System.out.println(i);
			}
		}

	}

}
