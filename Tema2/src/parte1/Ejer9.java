package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		String eleccion1;
		String eleccion2;
		final String tijera = "TIJERA";
		final String piedra = "PIEDRA";
		final String papel = "PAPEL";
		Scanner lectura = new Scanner(System.in);
		System.out.println("Eres el jugador 1 elije PIEDRA, PAPEL O TIJERA");
		eleccion1 = lectura.nextLine();
		System.out.println("Eres el jugador 2 elije PIEDRA, PAPEL O TIJERA");
		eleccion2 = lectura.nextLine();
		if (eleccion1.equalsIgnoreCase(eleccion2))
			System.out.println("El resultado ha sido empate");
		else if (eleccion1.equalsIgnoreCase(tijera) && eleccion2.equalsIgnoreCase(papel))
			System.out.println("Gana Jugador 1");
		else if (eleccion1.equalsIgnoreCase(papel) && eleccion2.equalsIgnoreCase(piedra))
			System.out.println("Gana Jugador 1");
		else if (eleccion1.equalsIgnoreCase(piedra) && eleccion2.equalsIgnoreCase(tijera))
			System.out.println("Gana Jugador 1");
		else
			System.out.println("Gana el jugador 2");
		lectura.close();

	}

}
