package lab11;

import java.util.ArrayList;
import java.util.List;

public class Lab11c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Name = new ArrayList<String>();
		Name.add("Ramesh");
		Name.add("Raj");
		Name.add(2, "Krish");
		Name.set(2, "Krishna");
		System.out.println(Name);
		System.out.println(Name.get(1));
		System.out.println(Name.contains("Ramesh"));

	}

}
