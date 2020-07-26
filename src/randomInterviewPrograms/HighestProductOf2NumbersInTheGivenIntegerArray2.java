package randomInterviewPrograms;

public class HighestProductOf2NumbersInTheGivenIntegerArray2 {
	public static void main(String[] args) {
		int array[] = { 1, -8, 3, -4, 5 };
		System.out.println(highestProduct(array));
	}

	private static int highestProduct(int[] array) {
		if (array == null || array.length == 0) return 0;

		int highest = array[0], secondHighest = array[0], smallest = array[0], secondSmallest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (highest < array[i]) { // fetch the highest
				secondHighest = highest;
				highest = array[i];
			} else if (secondHighest < array[i] && array[i] != highest) // fetch the second highest
				secondHighest = array[i];

			if (smallest > array[i]) { // fetch the smallest
				secondSmallest = smallest;
				smallest = array[i];
			} else if (secondHighest > array[i] && array[i] != smallest) // fetch the second smallest
				secondSmallest = array[i];
		}

		return Math.max(smallest * secondSmallest, highest * secondHighest);
	}

}
