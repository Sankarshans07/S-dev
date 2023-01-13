package simple;

public class BreakExample2 {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {
			
			System.out.println("Good Morning ");
			if(i == 4) {
				System.out.println();
				continue;
			}
			System.out.println("Good Afternoon");
			System.out.println("Good Night\n");
		}

	}

}
