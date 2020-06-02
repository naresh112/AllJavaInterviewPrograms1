package com.collections.examples;

public class IntArrayPlusMinusPrint {
	public static void main(String[] args) {
		int[] arr = { 2, -1, -3, 1, -2, 3, -5, 4, 5,-4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] >= 0) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
				else if(arr[i] <0) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			
		System.out.println(arr[i]);

		}
	}

}
