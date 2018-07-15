package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {

	public static Boolean intArraySorted(int[] unsorted) {
		// TODO Auto-generated method stub
		boolean sorted = true;
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = 0; j < unsorted.length; j++) {
				if (j > i) {
					if (unsorted[i] > unsorted[j]) {
						sorted = false;
					}
				}

			}
		}
		return sorted;
	}
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	public static Boolean doubleArraySorted(double[] unsorted) {
		// TODO Auto-generated method stub
		boolean sorted = true;
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = 0; j < unsorted.length; j++) {
				if (j > i) {
					if (unsorted[i] > unsorted[j]) {
						sorted = false;
					}
				}

			}
		}
		return sorted;

	}

	public static Boolean charArraySorted(char[] sorted) {
		// TODO Auto-generated method stub
		boolean ifSorted = true;
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted.length; j++) {
				if (j > i) {
					if (sorted[i] > sorted[j]) {
						ifSorted = false;
					}
				}

			}
		}
		return ifSorted;
	}

	public static Boolean stringArraySorted(String[] sorted) {
		// TODO Auto-generated method stub
		boolean ifSorted = true;
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted.length; j++) {
				if (j > i) {
					if (sorted[i].compareToIgnoreCase(sorted[j]) >= 0) {
						ifSorted = false;
					}
				}

			}
		}
		return ifSorted;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
