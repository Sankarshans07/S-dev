package inh_2;

public class Tata {
	
	private void colors() {
		System.out.println("colors");
	}
	
	public void zee(int a) {
		System.out.println("zee kannada");
	}
	
	public static void ETV() {
		System.out.println("ETV");
	}
	
	public static void main(String v[]) {
		Tata tata = new Tata();
		tata.colors();
		tata.zee(10);
		Tata.ETV();
	}
}
