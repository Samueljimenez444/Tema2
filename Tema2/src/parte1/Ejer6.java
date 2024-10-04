package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int x2;
		Scanner lectura = new Scanner(System.in);
		a = lectura.nextInt();
		b = lectura.nextInt();
		c = lectura.nextInt();
		x= (int) (-b+Math.sqrt(b-4*a*c));
		System.out.println(x);
	}

}
