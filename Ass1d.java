package assignment;

public class Ass1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2020;

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	}
}
