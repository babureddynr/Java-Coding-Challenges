package java_logics.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Random_Number_Generator {

	public static void main(String[] args) {
Random r1= new Random();
int no=r1.nextInt(10000)+1;
System.out.println(no);
	}

}
