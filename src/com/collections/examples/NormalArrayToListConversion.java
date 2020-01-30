package com.collections.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalArrayToListConversion {
	public static void main(String[] args) {
		String ar1[]=new String[4];
		
		ar1[1]="hello";
		ar1[2]="tom";
		ar1[0]="hari";
		ar1[3]="ramesh";
		//we can declare like this also
		//String ar1[]=new String[] {"hello","raju"};
		//System.out.println(ar1[0]);
		for(String temp:ar1) {
			System.out.println(temp);
		}
		List<String> arraylist1=new ArrayList<String>(Arrays.asList(ar1));
		System.out.println(arraylist1);
		
	}
}
