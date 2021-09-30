package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();  
        l.add("Black");  
        l.add("Blue");  
        l.add("Brown");  
        l.add("Green");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  

	}

	}


