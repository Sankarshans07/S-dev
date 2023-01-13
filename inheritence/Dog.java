package inheritence;

public class Dog  extends Animal{

	public void display() {
	    System.out.println("My name is " + name);
	    System.out.println("I am very sharp");
	  }
	
	public static void main(String args[]) {
		
		Dog dog = new Dog();
		dog.setName("ceaser");
		dog.eat();
		dog.display();
	}
	
}
