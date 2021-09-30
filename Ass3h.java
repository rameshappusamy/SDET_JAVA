package assignment;

import java.util.Hashtable;
import java.util.Map;

public class Ass3h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Sehwag");  
		  hm.put(102,"Sachin");  
		  hm.put(101,"Ganguly");  
		  hm.put(103,"Dravid");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}

}
