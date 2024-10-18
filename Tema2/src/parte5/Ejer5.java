package parte5;

import java.util.Random;
import java.util.Scanner;


public class Ejer5 {

	public static void main(String[] args) {
		Random rand = new Random();
		String adivinar;
		int numeroOrdenador = rand.nextInt(1, 101);
		int numeroUsuario;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce un numero, el ordenador tratara de adivinarlo");
		numeroUsuario=lectura.nextInt();
do {
	if(numeroUsuario>numeroOrdenador) {
		adivinar=lectura.next();
		System.out.println("El numero que has pensado es menor");
		 numeroOrdenador = rand.nextInt(1, 101);
	}
	else if(numeroOrdenador>numeroUsuario) {
		adivinar=lectura.next();
	System.out.println("El numero que has pensado es mayor");
	numeroOrdenador = rand.nextInt(1, 101);
	}
	}while(numeroUsuario!=numeroOrdenador);
System.out.println("Has ganado ordenador estaba pensando en " + numeroUsuario + " y tu has finalmento adivinado diciendo " + numeroOrdenador);
lectura.close();
	}
}
