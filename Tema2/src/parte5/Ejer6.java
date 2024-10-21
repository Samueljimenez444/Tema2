package parte5;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		String jugador1 = "O";
		String jugador2 = "O";
		String partida = "O";
		Scanner lectura = new Scanner(System.in);
		
	
		do {
			do {
				System.out.println("Introduce Piedra Papel o Tijera");
				jugador1 = lectura.next();
			} while (!jugador1.equalsIgnoreCase("TIJERA") && !jugador1.equalsIgnoreCase("PAPEL")
					&& !jugador1.equalsIgnoreCase("PIEDRA"));
			do {
				System.out.println("Introduce Piedra Papel o Tijera");
				jugador2 = lectura.next();
			} while (!jugador2.equalsIgnoreCase("TIJERA") && !jugador2.equalsIgnoreCase("PAPEL")
					&& !jugador2.equalsIgnoreCase("PIEDRA"));
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("Empate");
			} else if (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Tijera")  || (jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Piedra")) || (jugador1.equalsIgnoreCase("Tijera") && jugador2.equalsIgnoreCase("Papel"))) {
				System.out.println("Ganador Jugador 1");
				System.out.println("Pulsad S para seguir jugando o N para terminar");
				jugador1 = lectura.next();
				jugador2 = lectura.next();
			} else
				System.out.println("Gana Jugador 2");
			System.out.println("Pulsad S para seguir jugando o N para terminar");
			jugador1 = lectura.next();
			jugador2 = lectura.next();
		} while (jugador1.equalsIgnoreCase("S") || jugador2.equalsIgnoreCase("S"));
		System.out.println("La partida ha terminado");
	}

}
