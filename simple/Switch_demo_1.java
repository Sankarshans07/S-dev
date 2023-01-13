package simple;

import java.util.Scanner;

public class Switch_demo_1 {

	public static void main(String[] args) {
	
		double radius= 0 , area=0 , circumference=0;
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter 1 - to find the area of circle");
		System.out.println(" enter 2 - to find the circumfernece  of circle");
		
		code = sc.nextInt();
		
		switch(code ) {
		
		case 1: System.out.println(" enter the radius of the  circle");
					radius = sc.nextDouble();
		            area = 3.14 * radius * radius;
		            System.out.println(" area of circle = " + area);
		break;
		case 2: System.out.println(" enter the radius of the circle");
					radius = sc.nextDouble();
					circumference = 2 * 3.14 * radius ;
					System.out.println(" circumference of circle = " + circumference);
        break;
		default : System.out.println("Invalid choice");
		}
		
	}

}
