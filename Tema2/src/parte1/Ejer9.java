package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		String eleccion1;
		String eleccion2;
		Scanner lectura=new Scanner(System.in);
		eleccion1=lectura.nextLine();
		eleccion2=lectura.nextLine();
		if(eleccion1.equals(eleccion2))
			System.out.println("El resultado ha sido empate");
	
	}

}
