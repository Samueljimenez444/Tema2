package parte7;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		//Creamos la variable entera horas que servira para almacenar las horas introducidas por el usuario
		int horas;
		//Creamos la variable entera minutos que servira para almacenar los minutos introducidos por el usuario
		int minutos;
		//Creamos la variable entera segundos que servira para almacernar los segundos que introduce el usuario
		int segundos;
		//Creamos la variable entera horasT que servira para calcular las horas totales que quedan despues de realizar el incremento en segundos del usuario
		int horasT = 0;
		int minutosT = 0;
		int segundosT = 0;
		int segundosIncrementados;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca las horas");
		horas = lectura.nextInt();
		System.out.println("Introduzca los minutos");
		minutos = lectura.nextInt();
		while (minutos >= 60 || minutos < 0) {
			System.out.println("Introduzca unos minutos correctos");
			minutos = lectura.nextInt();
		}

		System.out.println("Introduzca los segundos");
		segundos = lectura.nextInt();
		while (segundos >= 60 || segundos < 0) {
			System.out.println("Introduzca unos segundos correctos");
			segundos = lectura.nextInt();
		}
		System.out.println("Introduzca los segundos que quieres incrementar el tiempo");
		segundosIncrementados = lectura.nextInt();

		for (int i = 0; i <= segundosIncrementados; i++) {
			segundosT = (segundos + i) % 60;
			minutosT = (minutos + (segundos + i) / 60) % 60;
			horasT = horas+((minutos + (segundos + i) / 60)/60);
		}
		System.out.println(horasT);
		System.out.println(minutosT);
		System.out.println(segundosT);
		
		}
}
