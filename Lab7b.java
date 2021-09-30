package lab7;

public class Lab7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		for(int i=0;i<name.length();i++)
		{
			if(Character.isAlphabetic(name.charAt(i)))
			{
			if(Character.isUpperCase(name.charAt(i)))
			{
				System.out.println(name.charAt(i)+ " character is upper case");
			}
			else
				System.out.println(name.charAt(i)+ " character is lower case");
			
		}
		}

	}

}
