package lab4;

public class Lab4a {

	
	static double n1=1.1, n2=1.1, n3= 2.1, largest;
	
	public double find(double n1, double n2, double n3)
	{
		
		if(n1>n2 && n1>n3)
			largest = n1;
		else if(n2>n1 && n2>n3)
			largest = n2;
		else if(n3>n1 && n3>n2)	
			largest = n3;
		
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lab4a obj = new Lab4a();
		System.out.println("Largest no is " + obj.find(n1,n2,n3));
		
	}

}


