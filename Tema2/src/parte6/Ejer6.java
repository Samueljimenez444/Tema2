package parte6;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		//Creamos la variable entera notas que servira para almacenar las notas de los usuarios
		int notas;
		//Creamos la variable entera suspensos y la inicializamos en 0, esta variable almacenara el numero de notas<5
		int suspensos=0;
		//Creamos el objeto Scanner
		Scanner lectura=new Scanner(System.in);
		//Creamos un bucle for donde inicializamos la variable i en 0, la condicion para salir del bucle sera que i>=5 e iremos incrementando el valor de i en +1
for(int i=0; i<5;i++ ) {
	//Print que le indica al usuario que hacer
	System.out.println("Introduce 5 notas y te dire cuantos alumnos han suspendido");
	//Definimos el valor de notas en funcion del input del usuario
	notas=lectura.nextInt();
	//Si notas<5
	if(notas<5) {
		//Se sumara a suspenso +1 para contabiliazar los alumnos suspensos
		suspensos++;
	}
	//Si la nota no entra en el rango de nota establecido
		else if(notas>10 || notas<0) {
			//El sistema le indica al usuario el error
		System.out.println("Una de las notas introducidas es incorrecta, vuelve a introducir una nota correcta");
		//Se resta a i -1 para que pueda introducir 5 notas
		--i;
	}

}
//Print de la 
System.out.println("El numero de suspensos es de " + suspensos + " suspensos");
//Cerramos el Scanner
lectura.close();
	}

}
