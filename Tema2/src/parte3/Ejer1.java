package parte3;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		int numero;
		int numero1;
		int numero11;
		int numero3;
		int numero4;
		int numero2;
		double capicua1;
		int capicua2;
		Scanner lectura=new Scanner(System.in);
		numero=lectura.nextInt();
		numero2=numero/10;
		capicua1=(((double) numero/10 -numero/10)*10);	
		if (numero<0 || numero>1000)
		System.out.println("El numero introducido no esta en el rango");
		else if(numero<10)
			System.out.println("El numero es capicua");
		else if(numero>10 && numero<100 && numero2==capicua1)
			System.out.println("El numero es capicua");
		else
			System.out.println("El numero no es capicua");

		

	
			

	}

}
