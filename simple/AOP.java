package simple;

import java.util.Scanner;

public class AOP {

	public static void main(String[] args) {
	
		int a, b , c;
		System.out.println("enter 2 integer values");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a + b;
		
		System.out.println("Addition of 2 numbers = " + c);
		
		
	}

}
