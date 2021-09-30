package assignment;

public class Ass2f {

	
		// TODO Auto-generated method stub
		private static final String inputString = "22.1";  
	    
	    public static void main(String[] args) {  
	        try {  
	                 int a = Integer.parseInt(inputString);  
	        }catch(NumberFormatException ex){  
	            System.err.println("Invalid string in argumment");  
	            //request for well-formatted string  
	        }  
	}

}
