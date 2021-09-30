package lab9;

public class Lab9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a =5,b=0;
			int c = a/b;
		}
		catch(Exception e)
		{
		System.out.println("Exception handled");
		}
	finally
		{
		System.out.println("I will be always executed");
		}
	}

}
