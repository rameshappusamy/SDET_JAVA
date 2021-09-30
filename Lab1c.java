package lab1;

public class Lab1c {
	
	public static int quotient(int no)
	{
		int quo = no/10;
		return quo;
	}
	
	public static int reminder(int no)
	{
		int rem = no%10;
		return rem;
	}

	public static void main(String[] args) {
		
		int a = 2300;
		System.out.println("Quotient of the given number " + a +" is "+ quotient(a));
		System.out.println("Reminder of the given number " + a +" is "+ reminder(a));

	}

}
