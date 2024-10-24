package parte6;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		//Creamos la variable entera a que servira para almacenar el numero del usuario (el primero introducido)
		int a;
		//Creamos la variable entera b que servira para almacenar el numero del usuario (el segundo introducido)
		int b;
		//Creamos la variable entera comparador que servira para determinar que numero es mayor
		int comparador=0;
		//Creamos la variable entera menor que servira para determinar que numero es mas pequeño de los dos introducidos
		int menor=0;
		//Creamos el objeto Scanner
		Scanner lectura=new Scanner(System.in);
		//Print que le indica al usuario que introduzca el numero a
		System.out.println("Introduzca el numero A");
		//Determinamos el valor de a en base al input del usuario
a=lectura.nextInt();
//Print que le indica al usuario que introduzca el numero b
System.out.println("Introduzca el numero B");
//Determinamos el valor de b en base al input del usuario
b=lectura.nextInt();
//Condicional if donde si a<b
if(a<b) {
	//b sera el numero mas grande (comparador)
	comparador=b;
	// a sera el numero mas pequeño (menor)
	menor=a;
	//Creamos un bucle for donde i= al numero menor, el bucle finalizara cuando el numero mayor>=i  y cada iteracion el valor de i aumentara en 1
	for(int i=menor; i<=comparador;i++ ) {
		//Prin de i
		System.out.println(i);
}
}
//Condicional else if donde si a>b
else if(a>b) {
	//a sera el numero mas grande (comparador)
	comparador=a;
	// b sera el numero mas pequeño (menor)
	menor=b;
	//Creamos un bucle for donde i= al numero mayor, el bucle finalizara cuando el numero mayor>=menor  y cada iteracion el valor de i decremetara en 1
	for(int i=comparador; i>=menor;i-- ) {
		System.out.println(i);
	}
}
//Si los numero a y b son iguales se le indicara al usuario
else
	System.out.println("El numero a y el numero b son iguales");
lectura.close();
	}

}
