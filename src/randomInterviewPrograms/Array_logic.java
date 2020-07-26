package randomInterviewPrograms;

import java.util.Scanner;

public class Array_logic {
	public static int[] arrayMethod(int array[], int target) {
		int arra2[] = new int[1];
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] == target) {
				arra2[0] = i;
				if (array[i] == array[i + 1]) {
					arra2[1] = i + 1;
				}
			}
		}
		return arra2;
	}

	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter The Array Length: ");
		int len = scobj.nextInt();
		int array[] = new int[len];
		System.out.println("Enter Array Elements in Ascending Order: ");
		for (int i = 0; i < len; i++) {
			array[i] = scobj.nextInt();
		}
		System.out.println("Enter The Target Value: ");
		int target = scobj.nextInt();
		System.out.println(arrayMethod(array, target));
	}
}