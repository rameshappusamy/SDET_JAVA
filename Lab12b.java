package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> books = new ArrayList<String>();
		books.add("English");
		books.add("Science");
		books.add("Maths");
		books.add("Social");
		books.add("physics");
		
		ListIterator<String> iterator = books.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
		

	}

}
