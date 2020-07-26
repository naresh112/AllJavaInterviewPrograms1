package com.programs.javaInterview;

import java.util.Scanner;

public class MultiplicationFirstDigitToThatNumGiventimes{

	public void Multiplication() {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = scr.nextInt();
		System.out.println("enter a number for number of itterations");
		int numberOfItr = scr.nextInt();
		while (numberOfItr > 0) {
			int	mulNum=num;
			char c = String.valueOf(mulNum).charAt(0);
			int firstDigit=Character.getNumericValue(c);
			mulNum = num * firstDigit;
			System.out.println(num+"*"+firstDigit+"="+mulNum);
			numberOfItr--;
			num=num*firstDigit;
			
		}
	}

	public static void main(String[] args) {
		new MultiplicationFirstDigitToThatNumGiventimes().Multiplication();
	}

}
