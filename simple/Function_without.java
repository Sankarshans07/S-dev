package simple;

public class Function_without {
	public static void main(String[] args) {
		double a;
		a=area();
		System.out.println("Area of  the triangle is= "+a);
	}
	static double area()
	{
	 double b,h,x;
		b=10;
		h=12;
		x=1.5*b*h;
		return(x);
	}
}
