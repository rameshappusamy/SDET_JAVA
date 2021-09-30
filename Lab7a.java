package lab7;

import java.util.Arrays;

public class Lab7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=4,k=0;
		String[] abc = new String[i];
		String[] abc1 = new String[i];
		abc[0] = "Jon";
		abc[1] = "Smith";
		abc[2] = "Lee";
		abc[3] = "Peter";
		
		System.out.println(abc.length);
		
		for(int j=abc.length-1;j>=0;j--)
		{
			abc1[k] = abc[j];
			k=k+1;
		}
		
		System.out.println(Arrays.asList(abc1));
	}
	}


