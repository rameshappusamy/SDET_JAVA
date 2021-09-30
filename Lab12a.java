package lab12;

import java.util.ArrayList;
import java.util.List;

public class Lab12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a = new ArrayList<String>();
		a.add("Ramesh");
		a.add("Prakash");
		a.add("Suresh");
		
		List<String> b = new ArrayList<String>();
		b.add("Sehwag");
		b.add("Sachin");
		b.add("Ganguly");
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);

	}

}
