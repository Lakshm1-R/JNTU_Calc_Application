package calculator;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("This is the new added line.");
		System.out.println("this is changed in github.");
        System.out.println("Calci Result :-");
        System.out.println("Sum = " + (a + b));
        sc.close();


	}

}
