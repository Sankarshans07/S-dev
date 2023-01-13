// program to find the eligibility for driving license
package simple;

import java.util.Scanner;

public class if_else_demo {

	public static void main(String[] args) {
	
		int age ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter u r age");
		
		age = sc.nextInt();
		
		if(age >0 && age < 16) {
			System.out. println("u r minor");
		}
		else if(age >=16 && age <18) {
			System.out.println("eligible to get the LLR");
		}
		else {
			System.out.println("eligible to get the Driving license");
		}
		
		
		
		
		
		

	}

}
