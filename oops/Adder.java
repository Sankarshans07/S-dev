package oops;

class Adder{  
	
	static int add(int a,int b) {
	return a+b;
	}  
	
	static void add(int a,int b,int c){
		System.out.println( a+b+c);
		}  
	
	public static void main(String[] args){  
		
	 System.out.println(Adder.add(11,11));  
	 Adder.add(11,11,11);  
}
}  
