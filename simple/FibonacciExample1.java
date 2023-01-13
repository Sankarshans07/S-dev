package simple;

import java.util.Scanner;

public class FibonacciExample1 {

	public static void main(String[] args) {
	
		int n1,n2,n3,i,count;  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count of fiboonacci numbers");
		count = sc.nextInt();
		System.out.println("enter any 2 non zero integers");
	
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=3;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  

	}

}
