package inh_2;

public class Airtel  extends Tata{
	
	public void udaya() {
		System.out.println("Udaya");
	}
	
	public void kasturi() {
		System.out.println("kasturi");
	}
	
	public void zee(int a , int b) {
		System.out.println("Zee twins");
	}
	
	public static void main(String v[]) {
		
		Airtel airtel = new Airtel();
//		airtel.colors();
		airtel.zee(10);
		airtel.zee(10,20);
		airtel.udaya();
		airtel.kasturi();
		
		Airtel.ETV();
		
	}

}
