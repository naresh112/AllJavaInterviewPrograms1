package com.programs.javaInterview;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Using regular expression we can remove unwanted chars from particular string
public class FromNaveenChannel {

	// remove unwanted char from given string
	public void removeJunkOrUnwantedCharFromString() {
		String str = "hello@#4kjk122";
		str = str.replaceAll("[^a-zA-z0-9]", "");
		// if we don't put ^ in above statement it will remove a to z charac and numbers
		System.out.println(str);
	}

	// reverse a number or integer
	public void reverseNumber() {
		int number = 123456789;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
	}

	// findout missing number in a integer array
	public void missingNumberInArray() {
		int[] a = { 1, 2, 3, 4, 5, 6, 8 };
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		System.out.println(sum);

	}
	
	
	
	public void duplicateValues() {
		String s = "selenium";
		char[] c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap();
		for (int i = 0; i <= c.length - 1; i++) {
			if (map.containsKey(c[i])) {
				int value = map.get(c[i]);
				map.put(c[i], value + 1);
			} else {
				map.put(c[i], 1);
			}
		}
		// way 1: using itetator method

		map.values();
		System.out.println("max value  :" + Collections.max(map.values()));
		Collections.max(map.values());
		Set<Character> char1 = map.keySet();
		Iterator<Character> itr = char1.iterator();
		while (itr.hasNext()) {
			char temp = itr.next();
			if (map.get(temp) > 1) {
				System.out.println("two times presents character is ..:" + temp);
			}
		}
		// way 2 using for each loop..
		for (Character tempchar : char1) {
			if (map.get(tempchar) == 1) {
				System.out.println("not duplicate character is :" + tempchar);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// new FromNaveenChannel().removeJunkOrUnwantedCharFromString();
		// new FromNaveenChannel().reverseNumber();
		// new FromNaveenChannel().duplicateValues();
		new FromNaveenChannel().missingNumberInArray();
	}

}
