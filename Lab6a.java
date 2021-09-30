package lab6;

public class Lab6a {

	public static void main(String[] args) {
	int sum = 0;
	
	int arr[] = {1,2,3,4,6};
	int length = arr.length;
	
	for(int i=0;i<length;i++)
	{
		sum=sum+arr[i];
	}
	
	double avg = sum/length;
	System.out.println("Sum is " + sum);
	System.out.println("Average is " + avg);
}
}
