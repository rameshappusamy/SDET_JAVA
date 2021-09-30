package lab2;

public class Lab2a {

	
	static String name = "ramesh"; //Static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 30;	// instance variable
		Lab2a obj = new Lab2a();
		obj.print(b, name);
		
	}

	public void print(int b ,String c)
	{
		int a = 10; // Local variable
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
