package simple;

import java.util.Scanner;

public class If_demo {

	public static void main(String[] args) {
	
		int a , b;
		System.out.println("enter 2 integer values");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println(" a is larger");
		}
		else {
			System.out.println(" b is larger");
		}

	}

}
