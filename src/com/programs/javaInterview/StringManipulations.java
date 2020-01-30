package com.programs.javaInterview;

public class StringManipulations {
	/* Author naresh kumar
	 *Java String class provides a lot of methods to perform operations on string such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
	 *String class belongs to java.lang package
	 *Java String is immutable  , mutable strings, you can use StringBuffer and StringBuilder classes.
	 *There are two ways to create String object:
		1.	By string literal
		2.	By new keyword
	 * 1.String s="welcome";  
		Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool
	 * 2.	String s=new String("Welcome");
	   creates two objects and one reference variable  
	   In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

	 */
	
	//**********1.convert char array into string************
	public void charArrayTostring() {
		char[] c = { 'j', 'a', 'v', 'a' };
		String s = new String(c);
		System.out.println("coverted char array to string : " + s);
	}

	public void charArrayTostring1() {
		char[] c = { 'j', 'a', 'v', 'a' };
		String s = "";
		for (int i = 0; i < c.length; i++) {
			s += c[i];
		}
		System.out.println("coverted char array to string : " + s);
	}
	//*********2.Strring concatination adding two strings**********
	public void addingTwoStrings() {
		String s1="naresh";
		String s2="kumar";
		s1.concat(s2); // here it dose not add the value to s1 
					   //we need to instantiate new string variables it stores the value
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	//********3.String comparisum**************
	/*
	 * We can compare string in java on the basis of content and reference.
	 * 1.equals()
	 * 2.compareTo()
	 * 3.== operator
	 */
	public void stringComparisum() {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4="hello12345";
		String s5="HELLO";
		System.out.println(s1.equals(s2)); //true    >it compares actual content(values of strings) in string 
		System.out.println(s1.equals(s5)); //false
		System.out.println(s1.equalsIgnoreCase(s5)); //true   >it compares actual content but ignores case sensitive
		
		
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1==s3);     // false  > = = operator compares references not values.
		/*
		 * here s1 reference pointing to string constant pool
		 * s3 reference pointing to Heap memory 
		 * both the values are same but references are different
		 */
		
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s4));// -5
		System.out.println(s4.compareTo(s1)); // 5
		System.out.println(s3.compareTo(s1)); // 0
		/*
		 * The String compareTo() method compares values lexicographically and returns an integer value
		 * that describes if first string is less than, equal to or greater than second string.
		 * s1.compareTo(s2) o/p is 0(zero)
		 * s1.compareTo(s4) o/p is -5 
		 * s4.comparesTo(s1) o/p is 5
		 */
	}
	
	//*********4.String Concatenation************
	public void stringConcatenation() {
		   String s1="naresh ";  
		   String s2="kumar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);//naresh kumar
	}
	/*
	 * pollyndrom 
	 * fact
	 */
	public void checkPalindrome() {
		String str="naresh";
		String rev="";
		for (int i =str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("given string is pollyndrome ");
			System.out.println(rev);
		}
		else{
			System.out.println("given string is not a pollyndrome ");
			System.out.println(rev);
		}
	}
	
	public static void main(String[] args) {
		//new StringManipulations().charArrayTostring();
		//new StringManipulations().charArrayTostring();
		//new StringManipulations().addingTwoStrings();
		//new StringManipulations().stringComparisum();
		new StringManipulations().checkPalindrome();
	}
	

}
