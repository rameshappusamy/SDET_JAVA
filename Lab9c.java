package lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab9c {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// String Date1="31/12/1998";
		String Date1="1998/12/31";
	    Date sDate1=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
	    System.out.println(sDate1+"\t"+Date1);  

	}

}
