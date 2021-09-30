package assignment;

import java.util.Arrays;
import java.util.Collections;

public class Ass1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,5,2,4,10,9,8,7,6};
		int n = a.length;

		Arrays.sort(a);
		//Arrays.sort(a,Collections.reverseOrder());
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
