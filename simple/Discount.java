package simple;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		double purchaseAmt , discount , disAmt, netAmt;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter u r purchase amt");
        purchaseAmt = sc.nextDouble();
        
        if(purchaseAmt <= 1000) {
        	discount = 0.0;
        }
        else if(purchaseAmt > 1000 && purchaseAmt <= 10000) {
        	discount = 0.05;
		}else if(purchaseAmt > 10000 && purchaseAmt <= 25000) {
			discount = 0.1;
		}else if(purchaseAmt > 25000 && purchaseAmt <= 50000) {
			discount = 0.3;
		}
		else {
			discount = 0.5;
		}
        
        disAmt = purchaseAmt * discount;
        netAmt = purchaseAmt - 	disAmt;
        
        System.out.println("purchaseAmt = " + purchaseAmt);
        System.out.println("disAmt = " + disAmt);
        System.out.println("netAmt = " + netAmt);
	}       
}
