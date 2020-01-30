package com.programs.javaInterview;

import java.util.HashMap;

public class MapExamples {



	public void findDuplicateValues() {
		String a="Hi all Hi Hi How are you doing I am doing well";


		String[] temp=a.split(" ");

		HashMap<String,Integer> map=new HashMap();


		for(int i=0;i<temp.length;i++) {
			if(map.containsKey(temp[i])) {
				int value=map.get(temp[i]);
				//System.out.println(value);
				map.put(temp[i], ++value);
			}else {
				map.put(temp[i],1);
			}
		}

		System.out.println(map);


		/*
		 * hi - 2 all - 1 How -1 doing 2
		 */
	}

	public void findDuplicateValuesInArray() {

		int arr[]= {10,30,40,10,20,50,60,60,30,80};

		int newArr[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {

				if(arr[i] < arr[j]) {

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i=0;i<arr.length;i++) {

			if(i!=arr.length-1) {

				if(arr[i] == arr[i+1]) {

				}else {
					newArr[index++]=arr[i];
				}

			}
			else {
				newArr[index++]=arr[i];
			}
		}

		System.out.println("************ ");
		for(int i=0;i<index;i++) {
			System.out.println(newArr[i]);
		}

	}

	public void printPostiveAndNegativeValues() {
		
		int arr[]= {3,2,1,-1,-3,-2,4,5,-5,-4};
		
		//op: 1,-1,2,-2,3,-3,4,-4
		
		int postiveArr[]=new int[arr.length/2];
		int negativeArr[]=new int[arr.length/2];
		int postiveIndex=0;
		int negativeIndex=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > 0) {
				postiveArr[postiveIndex++]=arr[i];
			}else {
				negativeArr[negativeIndex++]=arr[i];
			}
			
		}
		
		
		for(int i=0;i<postiveArr.length;i++) {
			for(int j=0;j<postiveArr.length;j++) {
				if(postiveArr[i] < postiveArr[j]) {
					int temp=postiveArr[i];
					postiveArr[i]=postiveArr[j];
					postiveArr[j]=temp;
				}
			}
		}
		for(int i=0;i<negativeArr.length;i++) {
			for(int j=0;j<negativeArr.length;j++) {
				if(negativeArr[i] > negativeArr[j]) {
					int temp=negativeArr[i];
					negativeArr[i]=negativeArr[j];
					negativeArr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<postiveArr.length;i++) {
			System.out.print(postiveArr[i]+" ");
			System.out.print(negativeArr[i]+" ");
		}
	}
	public void charNadNumCount() {
		String word="hysdgfj6536jdcjh";
		String[] arr=word.split(word);
		System.out.println(arr[2]);
	}
	
	
	
	public static void main(String[] args) {
		//new MapExamples().printPostiveAndNegativeValues();
		//new MapExamples().findDuplicateValuesInArray();
		new MapExamples().findDuplicateValues();
		//new MapExamples().charNadNumCount();		
		
		//String a="seleniumTest"
		//output: selenium_Test;
		
		
		
	}
}
