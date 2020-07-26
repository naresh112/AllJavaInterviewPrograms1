package randomInterviewPrograms;

import java.util.HashSet;

/**
 * Given a positive integer N, user has to print two numbers N1 and N2, satisfying below condition: 
 * 1) N1 + N2 = N 
 * 2. N1, N2 both should be Prime 
 */

import java.util.Scanner;
import java.util.Set;

/**
 * @author ashutosh.verma1
 *
 */
public class BreakIntegerIntoTwoPrimes {

	/**
	 * Method checks if a number is prime or not and returns a boolean value.
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		if (number > 2 && number % 2 == 0) {
			return false;
		}
		for (int j = 3; j <= Math.sqrt(number); j += 2) {
			if (number % j == 0)
				return false;
		}
		return true;
	}

	/**
	 * Method takes an integer number input by user and returns two integer numbers
	 * as an output which satisfies below criteria: 1) N1 + N2 = N 2) N1, N2 both
	 * should be Prime
	 * 
	 * using SET to avoid duplicate elements. If no matching combination found in
	 * the SET, it displays a message
	 * 
	 * @param number
	 */
	public static void breakIntegerIntoTwoPrimes(int number) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 3; i <= number; i++) {
			if (!set.contains(i) && i != number - i && isPrime(i) && isPrime(number - i)) {
				set.add(i);
				set.add(number - i);
				System.out.println("Numbers are= " + i + " and " + (number - i));
			}
		}
		if (set.isEmpty()) {
			System.out.println("No matching criteria");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int number = sc.nextInt();
		breakIntegerIntoTwoPrimes(number);
		sc.close();
	}
}
