package parte6;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		int a;
		int b;
		int comparador=0;
		int menor=0;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Introduzca el numero A");
a=lectura.nextInt();
System.out.println("Introduzca el numero B");
b=lectura.nextInt();
if(a<b) {
	comparador=b;
	menor=a;
	for(int i=menor; i<=comparador;i++ ) {
		System.out.println(i);
}
}
else if(a>b) {
	comparador=a;
	menor=b;
	for(int i=comparador; i>=menor;i-- ) {
		System.out.println(i);
	}
}
else
	System.out.println("El numero a y el numero b son iguales");

	}

}
