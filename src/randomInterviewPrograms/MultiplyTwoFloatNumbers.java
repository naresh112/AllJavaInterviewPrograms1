package randomInterviewPrograms;

import java.util.Scanner;

public class MultiplyTwoFloatNumbers {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a float number :A");
		float num1=reader.nextFloat();
		System.out.println("enter a float number :B");
		float num2=reader.nextFloat();
		float sum=num1+num2;
		System.out.println("sum of two floating numbers is : "+sum);
	}

}
