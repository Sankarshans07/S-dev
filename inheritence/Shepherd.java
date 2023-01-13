package inheritence;
import inh_1.Dog;

public class Shepherd  extends Dog{

	public void weight() {
		System.out.println("40 kg");
	}
	
	public void length() {
		System.out.println("1.5 meters");
	}
	
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.eat();
		dog.sound();

	}

}
