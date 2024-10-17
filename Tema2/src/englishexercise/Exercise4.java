package englishexercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Random rand= new Random();
int numero=rand.nextInt(1,101);
int trying=0;
Scanner reader=new Scanner(System.in);
System.out.println("Introduce a number");
while(trying!=numero && trying!=-1) {
	System.out.println("Try again");
	trying=reader.nextInt();
	if(trying<numero) {
	System.out.println("The number you introduced is lower");
	}
	else if(trying>numero) {
		System.out.println("The number you introduced is higher");
	} 
	else if (trying==numero)
			System.out.println("You are the winner");
}
System.out.println("You loose");
System.out.println("The number was " + numero);
	}
}
