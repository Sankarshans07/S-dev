package simple;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
	
		double percentage , CetRank ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PU u r percentage");
		
		percentage = sc.nextDouble();
		
		if(percentage >= 35) {
			
			System.out.println("enter u r CET Ranking");
			CetRank = sc.nextDouble();
				if(CetRank <= 5000) {
					System.out.println("Eligible for medical");
				}
				else
				{
					System.out.println("Eligible for Engineering");
				}
			
		}
		else {
			System.out.println("Rewrite the exam");
		}
		
	}

}
