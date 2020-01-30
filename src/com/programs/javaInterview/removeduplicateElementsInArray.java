package com.programs.javaInterview;

public class removeduplicateElementsInArray {
	//check the code some errors is there
	public static void main(String[] args) {
		int myArray[]= {10,20,20,30,30,20,50,50};
		int newArray[]=new int[myArray.length];
		//int index=0;
		System.out.println(myArray.length);
		for(int i=0; i<myArray.length; i++) {
			for(int j=i+1;j<myArray.length;j++)
	     
	            if(myArray[i] == myArray[j]) {
	            	//newArray[i]=myArray[i];
	            	
	            	//System.out.println("duplicate value is ::"+myArray[i]);
	         }
	            else {
	            	newArray[i]=myArray[i];
	            	
	            }
			System.out.println(newArray[i]);
	      }
		
		//System.out.println(newArray[2]);
	    
	}

}
