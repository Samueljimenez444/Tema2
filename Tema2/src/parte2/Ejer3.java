package parte2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	float numero1;
	float  numero2;
	float total;
	char eleccion;
	final char LETRA='A';
	final char LETRAB='B';
	final char LETRAC='C';
	final char LETRAD='D';
	final char LETRAA='a';
	final char LETRABB='b';
	final char LETRACC='c';
	final char LETRADD='d';
	
	Scanner lectura=new Scanner(System.in);
	
	System.out.println("Introduce un numero");
	numero1=lectura.nextFloat();
	
	System.out.println("Introduce otro numero");
	numero2=lectura.nextFloat();
	
	System.out.println("Seleccione una de las siguientes opciones");
	
	
	System.out.println("A. SUMAR LOS NUMEROS");
	System.out.println("B. RESTAR LOS NUMEROS");
	System.out.println("C. MULTIPLICAR LOS NUMEROS");
	System.out.println("D. DIVIDIR LOS NUMEROS");
	eleccion=lectura.next().charAt(0);
	
	switch(eleccion) {
	case LETRA,LETRAA->{		
		total=numero1+numero2;
System.out.println(total);
	}
	case LETRAB,LETRABB->{		
		total=numero1-numero2;
System.out.println(total);
	}
	case LETRAC,LETRACC->{		
		total=numero1*numero2;
System.out.println(total);
	}
	case LETRAD,LETRADD->{		
		total=numero1/numero2;
System.out.println(total);}
default->{
System.out.println("Introduce un valor correcto");
	}
	
	

	
	
	
	}
	}
	}
