package assignment;

import java.util.TreeSet;

public class Ass3f {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(101);  
        set.add(126);  
        set.add(-12);  
        set.add(150);  
        System.out.println("Lowest Value: "+set.pollFirst());  
        System.out.println("Highest Value: "+set.pollLast());  

	}

}
