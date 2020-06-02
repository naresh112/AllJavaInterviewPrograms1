package naveenAutomationlabs90qes;

import java.util.Scanner;

public class AddingTwoNumbersGivenByUser {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number :A");
		int num1=reader.nextInt();
		System.out.println("enter a number :B");
		int num2=reader.nextInt();
		int sum=num1+num2;
		System.out.println("sum of A and B : "+sum);
	}

}
