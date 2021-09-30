package assignment;

public class Ass1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		int j = 2;
		int count = 0;

		while (n <= 10) //to execute the while loop till 10 prime numbers are printed
		{
			count = 0;
			for (int i = 2; j >= i; i++) {

				if ((j % i == 0)) {

					count++;             // if count is more than 1, the number is divisible by othen than the own no as well

				}
			}

			if (count == 1) {
				System.out.println("Prime no" + j);
				n++;
			}
			j++;
		}
	}

}
