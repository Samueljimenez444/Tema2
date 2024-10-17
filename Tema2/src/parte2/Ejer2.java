package parte2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		//Declaramos la variable entera dia que servira para definir el dia de la semana
		int dia;
		//Creamos el objeto Scanner
		Scanner lectura= new Scanner(System.in);
		//Print que le da indicaciones al usuario
		System.out.println("Introduzca un numero de 1 a 7 y dode cada numero corresponde a un dia de la semana");
		//Definimos la variable dia en funcion del input del usuario
		dia=lectura.nextInt();
		/*Creamos un condicional multiple switch donde dependiendo del numero introducido por el usuario este sabra a que dia de la semana pertenece cada numero, si dia=1 el dia sera lunes, para dia=2 sera martes para dia=3 miercoles, para dia=4 jueves para dia=5 viernes, para dia=6 sabado y para dia=7 domingo*/
switch(dia) {
case 1->{
	System.out.println("Lunes");
}
case 2->{
	System.out.println("Martes");
}
case 3->{
	System.out.println("Miercoles");
}
case 4->{
	System.out.println("Jueves");
}
	case 5->{
		System.out.println("Viernes");
	}
		case 6->{
			System.out.println("Sabado");
		}
			case 7->{
				System.out.println("Domingo");
				//Cierre Scanner
				lectura.close();
			}
	
	}
	}
}
	
