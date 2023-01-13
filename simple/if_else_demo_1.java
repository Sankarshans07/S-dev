package simple;

import java.util.Scanner;

public class if_else_demo_1 {

	public static void main(String[] args) {
	
		int color;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number from 1 - 7");
		
		color = sc.nextInt();
		
		if(color == 1) {
			System.out.println("Voilet");
		}
		else if(color == 2) {
			System.out.println("Indigo");
		}
		else if(color == 3) {
			System.out.println("Blue");
		}
		else if(color == 4) {
			System.out.println("Green");
		}
		else if(color == 5) {
			System.out.println("Yellow");
		}
		else if(color == 6) {
			System.out.println("Orange");
		}
		else if(color == 7) {
			System.out.println("Red");
		}
		else  {
			System.out.println("Invalid color");
		}


	}

}
