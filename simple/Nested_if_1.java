package simple;

import java.util.Scanner;

public class Nested_if_1 {

	public static void main(String[] args) {
	

				double percentage , CetRank , sslcPerc ;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter PU u r percentage");
				
				percentage = sc.nextDouble();
				
				if(percentage >= 35) {
					
					System.out.println("enter u r CET Ranking");
					CetRank = sc.nextDouble();
						if(CetRank >0 && CetRank <= 1000) {
							System.out.println("Eligible for medical");
						}
						else if(CetRank >1000 && CetRank <= 2000)
						{
							System.out.println("Eligible for Dental");
						}
						else if (CetRank >2000 && CetRank <= 5000) {
							System.out.println("Eligible for Ayurvedic");
						}
						else {
							System.out.println("Eligible for Engineering");
						}
				}
				else {
					System.out.println("enter u r 10th percentage");
					sslcPerc = sc.nextDouble();
							if(sslcPerc > 35 && sslcPerc <=50 ) {
								System.out.println("Eligible for Industrial Training");
							}
							else if(sslcPerc > 50 && sslcPerc <=100) {
								System.out.println("Eligible for Diploma");
							}

				}
				
			}
}

	
