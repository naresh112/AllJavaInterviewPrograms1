package com.newBatch.Selenium;

public class AscendingOrderGivenArray {

	public static void main(String[] args) {
		int[] intarray=new int[] {2,6,80,5,91};
		for (int i = 0; i < intarray.length; i++) {
			for (int j = i; j < intarray.length; j++) {
				if(intarray[i]>intarray[j]) {
					int temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
			}
			
		}
		for (int i : intarray) {
			System.out.print(i+" ");
		}

	}

}
