package Guess_OutPut;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Date_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
String date= sdf.format(new Date());
System.out.println(date);
	}

}
