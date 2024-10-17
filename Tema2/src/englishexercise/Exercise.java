package englishexercise;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		int number = 0;
		int countereven = 0;
		int counterodd = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce as many numbers as you want, when you want to end introduce a negative number ");
		while (number >= 0)
			number=reader.nextInt();
			
		System.out.println("Introduce another number ");
		if (number%2 == 0) {
			++countereven;
		} else {
			++counterodd;
		}
		System.out.println(countereven);
		System.out.println(counterodd);
	}
}
