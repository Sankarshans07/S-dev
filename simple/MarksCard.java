// program to print the percentage of the student
package simple;

import java.util.Scanner;

public class MarksCard {

	public static void main(String[] args) {
	
		float  marks , perc ;
		int s1 , s2 , s3 , s4 , s5 , s6;
		System.out.println("enter the marks of  6 subjects");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();
		s6 = sc.nextInt();
		
		marks = s1 + s2 + s3 + s4 +s5 + s6 ;
		perc = marks/6 ;
		
		System.out.println("TOTAL MARKS  = " + marks);
		System.out.println("PERCENTAGE = " + perc);
		
		if (s1 < 35 || s2 < 35 || s3< 35 || s4 < 35|| s5 < 35|| s6 < 35){
			
			System.out.println("FAIL");
			}
		else {
				if(perc >= 85 && perc <= 100) {
					System.out.println("DISTINCTION");
				}
				else if(perc >= 70 && perc <= 84) {
					System.out.println("HIGH FIRST CLASS");
				}
				 else if(perc >= 60 && perc <= 69) {
					System.out.println("FIRST CLASS");
				}
				 else if(perc >= 50 && perc <= 59) {
					System.out.println("SECOND CLASS");
				}
				 else if(perc >= 35 && perc <= 49) {
					System.out.println("PASS");
				}
		}	
				
	}

}
