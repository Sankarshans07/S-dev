package simple;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
		int n, count = 1;   
	      float   average, sum = 0 , sub;   
	      Scanner sc = new Scanner(System.in);     
	      System.out.println("Enter no of subject of u r academin");  
	      n = sc.nextInt();  
	      while (count <= n)   
	             {   
	                  System.out.println("Enter the  marks for sub " + count + ": ");  
	                  sub = sc.nextInt();  
	                  sum = sum + sub;   
	                  ++count;   
	             }   
	                  average = sum/n;   
	        System.out.println("The total marks  is  : " + sum );  
	        System.out.println("The percentage  is " + average + "%");  
	}

}
