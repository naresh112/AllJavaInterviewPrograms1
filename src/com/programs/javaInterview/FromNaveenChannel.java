package com.programs.javaInterview;

import java.awt.image.SampleModel;
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
	public void reverseString() {
		String s="hello";
		String reverse="";
		char[] cArray=s.toCharArray();
		for (int i = cArray.length-1; i >=0; i--) {
			reverse+=cArray[i];
			
		}
		System.out.println(reverse);
	}
	public void largeAndSmallNumFromArray() {
		int[] numArray= {-10,10,30,50,20,80};
		int largestNum=numArray[0];
		int smallestNum=numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i]>largestNum) {
				largestNum=numArray[i];
			}
			else if(numArray[i]<smallestNum) {
				smallestNum=numArray[i];
			}
		}
		System.out.println("smallest num is :"+smallestNum+" and largest num is "+largestNum);
		
	}
	//interview purpose very imp concept below method
	public static void stringManipulations() {
		String str="hello naresh how are you";
		//          012345678901234567890123 lengh=23
		String str2="hello naresh how are you";
		String str3="Hello naresh how are you";
		
		System.out.println("length of array :"+str.length());
		System.out.println("char at 5th possition :"+str.charAt(5));
		System.out.println("o char possition :"+str.indexOf("o"));//it si 1st occurance of O
		//here where the "o" possition is found that position will remains skips...
		//***in interviewer will ask i want 2nd "o" position at that time below statement
		//here directly we can give po
		System.out.println("2nd possition is :"+str.indexOf("o",str.indexOf("o")+2));//2nd occurancy of o
		//2 nd 3rd occurancy search google
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("how"));
		System.out.println(str.indexOf("kjdsnfksd"));//somany people think o/p is error or some exception but it will give 
		//output is "-1"
		//string comparisum..
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str.equalsIgnoreCase(str3));//here cases (capt or small) ignored 
		//substring
		System.out.println(str.substring(6, 12)); //it will give o/p char is in b/w
		//6 and 16
		System.out.println(str.trim());
		//it will trim the speaces befor anfter string bt it could not delete between speaces
		System.out.println(str2.replace(" ", "_"));
		String[] strArray=str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

	public static void main(String[] args) {
		// new FromNaveenChannel().removeJunkOrUnwantedCharFromString();
		// new FromNaveenChannel().reverseNumber();
		// new FromNaveenChannel().duplicateValues();
		//new FromNaveenChannel().missingNumberInArray();
		//new FromNaveenChannel().reverseString();
		//new FromNaveenChannel().largeAndSmallNumFromArray();
		new FromNaveenChannel().stringManipulations();
	}

}
