package com.newBatch.Selenium;

public class FindMaxNumInGivenArray {
	

	public static void main(String[] args) {
		int hiValue = 0;
		int[] array=new int[]{5,8,6,4,2,3,56,2};
		for (int i = 0; i < array.length; i++) {
			if(array[i]>hiValue) {
				hiValue=array[i];
			}
		}
		System.out.println("highest value is :"+hiValue);
	}

}
