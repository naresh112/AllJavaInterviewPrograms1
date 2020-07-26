package com.programs.javaInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Jan11th_Task_Solutions {

	public void largeValueInGivenArray() {
		int[] numberArr = { 28, 56, 5, 2, 6, 84, 12 };
		int val = numberArr[0];
		for (int i = 0; i < numberArr.length; i++) {
			if (numberArr[i] > val) {
				val = numberArr[i];
			}
		}
		
		System.out.println("largest value is :" + val);
	}
	public void arrayReverse() {
		int[] numberArr = { 28, 56, 5, 2, 6, 84, 12,1 };
		int arrayLength=numberArr.length-1;
		//System.out.println("array length "+arrayLength/2);
		for (int i = 0; i < arrayLength/2; i++) {
			int temp=numberArr[i];
			numberArr[i]=numberArr[arrayLength-i];
			numberArr[arrayLength-i]=temp;
		}
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
	}

	public void appendUnderscoreBeforeUpperChar() {
		String temp = "";
		String x = "helloHowAreYou";

		for (int y = 0; y < x.length(); y++) {
			if (Character.isUpperCase(x.charAt(y))) {
				char w = x.charAt(y);
				temp = temp + "_" + x.charAt(y);
			} else {
				temp = temp + x.charAt(y);
			}
		}
		System.out.println("append Underscore Before Upper Character output is :" + temp);
	}

	public void convertingAssendingArray() {
		int[] a = { 50, 30, 10, 10, 20, 32, 85, 4, 22 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public void convertingAssendingArray1() {
		int[] a = { 50, 30, 10, 10, 20, 32, 85, 4, 22 };
		Arrays.sort(a);
		//About Java.Util.Arrays Link>>> https://www.geeksforgeeks.org/array-class-in-java/
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");

		}
	}

	public void MostRepeatingElement() {
		int[] a = { 10, 30, 30, 20, 30, 20, 20, 20, 30, 20 };
		int value = 0;
		int mostRepeatingElement = 0;
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				mostRepeatingElement = a[i];
				value = map.get(a[i]);
				map.put(a[i], ++value);

			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		System.out.println("Most repeating element is --:" + mostRepeatingElement + " and number of repeations is :"
				+ Collections.max(map.values()) + " times");
		// System.out.println(map.keySet());
		// System.out.println(map.values());
	}

	// without HashMap concept finding ,majority(maximum repeated element)
	public void findingMajorityElement1() {
		int a[] = { 10, 30, 30, 20, 30, 20, 20, 20, 30, 20 };

		int maxRepeatations = 0;
		int mostRepeatingElement = 0;
		for (int i = 0; i < a.length; i++) {
			int tempCount = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					tempCount++;
				mostRepeatingElement = a[i];
			}
			if (tempCount >= maxRepeatations)
				maxRepeatations = tempCount;
		}
		System.out.println("Most repeating element is --:" + mostRepeatingElement + " and number of repeations is :"
				+ maxRepeatations + " times");
	}

	public void sentenceReverse() {
		// no need String.split() method
		String sentence = "happay pongal to everyone";
		char[] sentenceArray = sentence.toCharArray();
		String rev = "";
		for (int i = sentenceArray.length - 1; i >= 0; i--) {
			rev += sentenceArray[i];
		}
		System.out.println(rev);

	}

	public void sentenceReverseAtSamePossition() {
		String sentence = "happay pongal to everyone";
		String[] sentenceArray = sentence.split(" ");
		for (int i = 0; i < sentenceArray.length; i++) {
			char[] c1 = sentenceArray[i].toCharArray();
			for (int j = c1.length - 1; j >= 0; j--) {
				System.out.print(c1[j]);
			}
			System.out.print(" ");
		}

	}

	public void sentenceReverseAtSamePossition1() {
		String sentence = "happay pongal to everyone";
		String[] sentenceArray = sentence.split(" ");
		String rev = "";
		for (int i = 0; i < sentenceArray.length; i++) {
			char[] c1 = sentenceArray[i].toCharArray();
			for (int j = c1.length - 1; j >= 0; j--) {
				rev += c1[j];
			}

			rev += " ";
		}
		System.out.println(rev);

	}

	public void nonRepeatingCharInAString() {
		String str = "hello";
		HashMap<Character, Integer> map = new HashMap();
		char[] strCharArray = str.toCharArray();
		for (int i = 0; i < strCharArray.length; i++) {
			if (map.containsKey(strCharArray[i])) {
				int value = map.get(strCharArray[i]);
				map.put(strCharArray[i], value + 1);

			} else {
				map.put(strCharArray[i], 1);
			}
		}
		Set<Character> mapKeys = map.keySet();
		for (Character character : mapKeys) {
			if (map.get(character) == 1) {
				System.out.println(character);
			}

		}

	}

	/*
	 * 
	 * public void missingNumberInArray() { int[] numbers = { 2, 1, 3, 4, 5, 7, 8, 9
	 * }; Arrays.sort(numbers); System.out.println();
	 * 
	 * }
	 */
	public void findPerfectSquareOrNot() {
		int number = 144;
		double sqr = Math.sqrt(number);
		if (sqr - Math.floor(sqr) == 0) {
			System.out.println("perfect sqare and the square value is :"+sqr);
		} else {
			System.out.println("not a square ");
		}

	}

	public static void main(String[] args) {
//		new Jan11th_Task_Solutions().largeValueInGivenArray();
//		new Jan11th_Task_Solutions().appendUnderscoreBeforeUpperChar();
//		new Jan11th_Task_Solutions().convertingAssendingArray();
//		new Jan11th_Task_Solutions().convertingAssendingArray1();
//		new Jan11th_Task_Solutions().findingMajorityElement();
//		new Jan11th_Task_Solutions().findingMajorityElement1();
//		new Jan11th_Task_Solutions().sentenceReverse();
//		new Jan11th_Task_Solutions().sentenceReverseAtSamePossition1();
//		new Jan11th_Task_Solutions().sentenceReverseAtSamePossition();
//		new Jan11th_Task_Solutions().nonRepeatingCharInAString();
//		new Jan11th_Task_Solutions().findPerfectSquareOrNot();
		new Jan11th_Task_Solutions().arrayReverse();
	}

}
