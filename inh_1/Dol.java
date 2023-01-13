package inh_1;

public class Dol  {

	public void height() {
		System.out.println("1.5 meters");
	}
	
	public void speed() {
		System.out.println("35 km/h");
	}
	public static void main(String[] args) {
	
		Dol dol = new Dol();
		dol.height();
		dol.speed();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		

	}

}
