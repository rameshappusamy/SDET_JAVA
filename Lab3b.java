package lab3;

public class Lab3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a = 2, l = 3, w=4,x=5,y=6,z=7;
		
		Lab3b c = new Lab3b();
		System.out.println("Square Perimeter is " + c.calculatePerimeter(a));
		System.out.println("Rectangle Perimeter is " + c.calculatePerimeter(l, w));
		System.out.println("Triange perimeter is " + c.calculatePerimeter(x, y, z));

	}

	public int calculatePerimeter(int l, int w)
	{
		int p = 2*(l+w);
		return p;
	}
	
	public int calculatePerimeter(int a)
	{
		int p = 4*a;
		return p;
	}
	
	public int calculatePerimeter(int a, int b, int c)
	{
		int p = a+b+c;
		return p;
	}
}
