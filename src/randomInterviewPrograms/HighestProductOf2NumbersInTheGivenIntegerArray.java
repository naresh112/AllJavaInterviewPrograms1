package randomInterviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class HighestProductOf2NumbersInTheGivenIntegerArray {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("enter the number of elements for comparing product");
		int inputNumberOfValues = scr.nextInt();
		int intArray[] = new int[inputNumberOfValues];
		System.out.println("enter the values");
		for (int i = 0; i < inputNumberOfValues; i++) {
			intArray[i] = scr.nextInt();
		}
		scr.close();
		Arrays.sort(intArray);
		if (inputNumberOfValues >= 3) {
			if (inputNumberOfValues == 3 && intArray[1] == 0) {
				if (intArray[0] * intArray[2] > 0) {
					System.out.println("max value is " + intArray[0] * intArray[2]);
				}
				System.out.println("max value is 0");
			} else if (intArray[0] * intArray[1] > intArray[intArray.length - 1] * intArray[intArray.length - 2]) {
				System.out.println("max value is " + intArray[0] * intArray[1]);
			} else {
				System.out.println("max value is " + intArray[intArray.length - 1] * intArray[intArray.length - 2]);
			}

		} else {
			System.out.println("enter more than 2 values, at that time we can compare which product will give highest value");
		}

	}
	

}
