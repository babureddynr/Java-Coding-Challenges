package java_logics.logics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbeer 1");
		double num1 = sc.nextDouble();
		System.out.println("enter a num 2");
		double num2 = sc.nextDouble();
		System.out.println("Enter a Operation (+ / * -)");
		char operation = sc.next().charAt(0);

		switch (operation) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		default:
			System.out.println("wrong operation or wrong input");
			break;

		}
	}

}
