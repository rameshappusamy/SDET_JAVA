package assignment;

public class Ass1b {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c;
		
		for(int i=0;i<8;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
			
		}

	}

}
