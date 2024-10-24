package parte6;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		int i=0;
		Scanner lectura=new Scanner(System.in);
		for(int numero=lectura.nextInt();i<=numero;++i);{
if(i%3==0)
	System.out.println(i);
		}
lectura.close();
	}
}
