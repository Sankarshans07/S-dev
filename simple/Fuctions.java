package simple;

public class Fuctions {

	public static void main(String[] args) {
		double b,h,a;
		b=10;
		h=12;
		a = area(b, h);
		System.out.println("Area of the triangle is ="+a);
	}
static double area (double x, double y)
{
	double z;
	z=1.5*x*y;
	return (z);
}
}
