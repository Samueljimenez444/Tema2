package englishexercise;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		//We create the variable height to check every height measure the user enters and select the maximumheight and the minheight
		double height=1;
		double height2=1;
		double minHeight=1;
		double maxHeight=0;
		Scanner reader=new Scanner(System.in);
		height=reader.nextDouble();
		minHeight=height;
		maxHeight=height;
		while(height2!=0) {
			System.out.println("Introduce a new height measure");
		height2=reader.nextDouble();
		if(height2>maxHeight) {
		maxHeight=height2;
		}
		else if(height2<minHeight) {
		minHeight=height;
	
	}
	System.out.println(maxHeight);
	System.out.println(minHeight);
		}
		}
	
	}

