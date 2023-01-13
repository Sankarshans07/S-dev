package simple;

import java.util.Scanner;

public class Switch_demo {

	public static void main(String[] args) {
	
		int color;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number from 1 - 7");
		
		color = sc.nextInt();
		
		switch(color) {
		case 1: System.out.println("Voilet");
					break;
		case 2: System.out.println("Indigo");
					break;
		
		case 3: System.out.println("Blue");
					break;
		
		case 4: System.out.println("Green");
					break;
		
		case 5: System.out.println("Yellow");
					break;
		
		case 6: System.out.println("Orange");
					break;
		
		case 7: System.out.println("Red");
					break;
		
		default : System.out.println("Invalid color");
		}
		

	}

}
