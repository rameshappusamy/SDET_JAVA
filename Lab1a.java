package lab1;

public class Lab1a {


	public double perimeter(double width, double length)
	{
		double p=2*(width+length);
		return p;
	}
	
	public double area(double width, double length)
	{
		double a = (width*length);
		return a;
		
	}
	public static void main(String[] args) {
		double width = 1.34;
		double length = 4.4;
		
		
		Lab1a obj = new Lab1a();
		double perimeter = obj.perimeter(width,length);
		double area = obj.area(width,length);
		
		System.out.println("Perimeter of rectangle is "+ perimeter);
		System.out.println("Area of rectangle is "+ area);
	}

}
