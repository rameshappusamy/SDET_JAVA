package lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab12c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(0);
		a.add(9);
		a.add(12);
		a.add(17);
		a.add(21);
		int max = Collections.max(a);
		int min = Collections.min(a);
		System.out.println(max);
		System.out.println(min);
	}

}
