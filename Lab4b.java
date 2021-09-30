package lab4;

public class Lab4b {
	
	static char value = 'K';
	
	public void validation(char val)
	{
		switch (val) {
		case 'a':
			System.out.println("Given value is vowel");
			break;
		case 'e':
			System.out.println("Given value is vowel");
			break;
		case 'i':
			System.out.println("Given value is vowel");
			break;
		case 'o':
			System.out.println("Given value is vowel");
			break;
		case 'u':
			System.out.println("Given value is vowel");
			break;
		default:
			System.out.println("Given value is consonant");
			break;
			}
			
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab4b obj = new Lab4b();
		obj.validation(value);
	}

}
