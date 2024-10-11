package Guess_OutPut;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Custom_date {

    public static void main(String[] args) {
     SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
     String date= sdf.format(new  Date());
     System.out.println(date);
    }
}
