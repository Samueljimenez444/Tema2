package englishexercise;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
int number;
int multiplier=0;
int counter=0;
Scanner reader=new Scanner(System.in);
System.out.println("Introduce a number");
number=reader.nextInt();
++counter;
while(counter<=9)
multiplier=number*counter;
System.out.println(multiplier);
++counter;
	}

}
