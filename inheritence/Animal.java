package inheritence;

import java.util.Scanner;

public class Animal {
	
	String name ;
	
	public void setName(String n) {
		name = n;
	}
	
	public void eat() {
	    System.out.println(name + " can eat");
	  }
	
public static void main(String args[]) {
	
	Animal  pug = new Animal();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter u r Dog name ");
	String n = sc.next();
	pug.setName(n);
	
	pug.eat();
	
	
}
}
