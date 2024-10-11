package Guess_OutPut;

import java.io.IOException;
import java.util.Scanner;

class InvalidAgeException  extends Exception
{
	public InvalidAgeException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class CustomException
{
	
	public static void validate(int age) throws InvalidAgeException
	{
		if(age>18)
		{
			System.out.println("eligible for the vote ");
		}else {
			throw new InvalidAgeException("Not eligible for the vote");
		}
	}
public static void main(String[] args) {

	try{
		validate(10);
	}catch(InvalidAgeException e)
	{
		System.out.println();
	}
	}
}
