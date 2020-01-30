package com.programs.javaInterview;

public class ReverseAString {

	public static void main(String[] args) {
		String s1="selenium";
		System.out.println(s1.length());
		
		/*1
		for(int i=s1.length()-1;i>=0;i--) {
		System.out.print(s1.charAt(i));
		}
		*/
		
		//or
		/*2
		String reverseString="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverseString=reverseString+s1.charAt(i);
			//dont print inside loop...uncommit check it once
			//System.out.println(reverseString);
			}
		System.out.println(reverseString);
		 */
		//OR
		//3
		//here i take stringBuffer StringBuffer is mutable class i can apply reverse method and 
		//String is immutable we cannt apply .revesre method
		//here im create a object for StringBuffer class
		StringBuffer s3= new StringBuffer("selenium");
		System.out.println(s3.reverse());
		
	}

}
