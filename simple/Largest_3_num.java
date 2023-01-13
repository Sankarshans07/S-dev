package simple;

import java.util.Scanner;

public class Largest_3_num {

	public static void main(String[] args) {
	
		int a , b , c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 Integer numer");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a > b ) {
			if(a > c) {
				System.out.println(a + "  is largest number");
			}
				else {
					System.out.println(c + "  is largest number");
				}
			}
		
		else if(b > c){
			System.out.println(b + "  is largest number");
		}
		else {
			System.out.println(c + "  is largest number");
		}
	
	}

}
