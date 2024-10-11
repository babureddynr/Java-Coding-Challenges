package Guess_OutPut;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_Format {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
		String date= sdf.format(new Date());
		System.out.println(date);

	}

}
