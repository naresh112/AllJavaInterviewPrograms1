package randomInterviewPrograms;

/**
 * 
 * @author madhu
 * 
 *
 */

public class Temp {

	
	/*
	 * Given a array of integers num sorted in ascending order, find the starting
	 * and ending position of a given target value. if the target is not found in
	 * the array, return[-1,-1]
	 */
	public static void findIndex(int arr[], int target) {
		int start = -1, last = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target && start == -1) {
				start = i;
			
			} if (arr[i] == target ) {
						last = i;
				
				
			}
			/*else if (arr[i]==start && arr[i]==last)
			{
				System.out.println("Element not found");
			}*/
			
			
		}
		 System.out.println(start);
		 System.out.println(last);


	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 5, 5, 5, 7, 8, 9, 9, 11 };
		int target = 11;
		findIndex(arr, target);
	}

}
