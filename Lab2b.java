package lab2;

public class Lab2b {
	
	static float a = 10.389655f;
	static float b = 20.091250f;
	
	public void display(float c, float d)
	{

		System.out.println("Before A value is "+ c);
		System.out.println("Before B value is "+ d);
		
		c = c+d;
		d = c-d;
		c = c-d;

		
		System.out.println("After A value is "+ c);
		System.out.println("After B value is "+ d);
	}

public static void main(String[] args) {
		
	
		Lab2b obj = new Lab2b();
		obj.display(a,b);
		
		/*System.out.println("Before A value is "+ a);
		System.out.println("Before B value is "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;

		
		System.out.println("After A value is "+ a);
		System.out.println("After B value is "+ b);*/
		
	
		

		
}
}
