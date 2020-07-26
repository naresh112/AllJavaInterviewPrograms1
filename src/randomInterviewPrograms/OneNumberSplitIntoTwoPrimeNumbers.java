package randomInterviewPrograms;

import java.util.Scanner;

public class OneNumberSplitIntoTwoPrimeNumbers {
	public void divideNumIntoOddNums() {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter a number for split into two prime numbers");
		int inputNum = scr.nextInt();
		scr.close();
		boolean flage = true;
		for (int i = 2; i < (inputNum / 2) + 1; i++) {
			if (checkPrime(i) && checkPrime(inputNum - i) && (i != inputNum - i)) {
				System.out.println("Given input number is " + inputNum + ": possible combinations of prime numbers are "+ i + " and " + (inputNum - i));
				flage = true;
			}
		}
		if (!flage) {
			System.out.println("we can not devide" + inputNum + " into two prime numbers");
		}
	}

	public boolean checkPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			int temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		new OneNumberSplitIntoTwoPrimeNumbers().divideNumIntoOddNums();
	}

}
