package Guess_OutPut;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Min_Max_Array {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the num1 value");
      double num1=sc.nextDouble();
      System.out.println("Enter the num2 value");
      double num2= sc.nextDouble();
      System.out.println("Enter the operator  (+ - / *)");
      char operator=sc.next().charAt(0);
      switch(operator)
      {
      case '+': System.out.println(num1+num2);
      break;
      case '-': System.out.println(num1+num2);
      break;
      case '/': System.out.println(num1+num2);
      break;
      case '*': System.out.println(num1+num2);
      break;
      default : System.out.println("invalid opartion");
      }
    }
}
