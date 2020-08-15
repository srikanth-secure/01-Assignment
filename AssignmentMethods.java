package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentMethods {

	// 0-------------------------------------------------------------------
	public void printOriginalArray(int no, int[] originalArray) {
		if (no != 0)
			System.out.println("\n" + no);
		System.out.println("Original Array " + Arrays.toString(originalArray));
	}

	// 1-------------------------------------------------------------------
	public Set<Integer> printDuplicateArray(int[] originalArray) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < originalArray.length; i++) {
			for (int j = i + 1; j < originalArray.length; j++) {
				if (originalArray[i] == originalArray[j]) {
					set.add(originalArray[j]);
				}
			}
		}
		return set;
	}

	// 2-------------------------------------------------------------------
	public List<Integer> removeDuplicateArray(int[] originalArray) {
		int i = 0;
		List<Integer> list = new ArrayList<Integer>();
		int arayLength = originalArray.length;
		while (i < arayLength) {
			int j = i + 1;
			while (j < arayLength) {
				if (originalArray[i] == originalArray[j]) {
					// Deleting element at position j by Shifting elements one to the left,
					for (int k = j; k <= arayLength - 2; k++)
						originalArray[k] = originalArray[k + 1];
					arayLength = arayLength - 1;
				} else
					j = j + 1;
			}
			i = i + 1;
		}
		for (int ii = 0; ii < arayLength; ii++)
			list.add(originalArray[ii]);
		return list;
	}

	// 3-------------------------------------------------------------------
	public int uniqueElementsSum(int[] originalArray) {
		List<Integer> list = new ArrayList<Integer>();
		list = removeDuplicateArray(originalArray);
		int sum = 0;
		for (Integer d : list)
			sum += d;
		return sum;
	}

	// 4-------------------------------------------------------------------
	public int returnPositionElement(int[] originalArray, int position) {
		Set<Integer> set = new HashSet<>();
		int result = 0;
		if (originalArray.length < position)
			return result;
		for (Integer num : originalArray)
			set.add(num);
		Object[] obj = set.toArray();
		for (int j = 0; j < obj.length; j++) {
			result = (int) obj[position - 1];
		}
		return result;
	}

	// 5-------------------------------------------------------------------
	public int maxDifference(int[] originalArray) {
		Arrays.sort(originalArray);
		int length = originalArray.length;
		int diff = originalArray[length - 1] - originalArray[0];
		return diff;
	}

	// 6-------------------------------------------------------------------
	public int[] minMaxArray(int[] originalArray) {
		Set<Integer> set = new HashSet<>();
		int[] newArray = new int[2];
		int length = originalArray.length;
		for (int i = 0; i < length; i++)
			set.add(originalArray[i]);
		Object[] obj = set.toArray();
		newArray[0] = (int) obj[0];
		newArray[1] = (int) obj[obj.length - 1];
		return newArray;
	}

	// 7-------------------------------------------------------------------
	public int[] secondMinMax(int[] originalArray) {
		Set<Integer> set = new HashSet<>();
		int[] newArray = new int[2];
		int length = originalArray.length;
		for (int i = 0; i < length; i++)
			set.add(originalArray[i]);
		Object[] obj = set.toArray();
		newArray[0] = (int) obj[1];
		newArray[1] = (int) obj[obj.length - 2];
		return newArray;
	}

//8----------------------------------------------------
	public List<Integer> findCommonElements(int[] array1, int[] array2) {
		List<Integer> commonElements = new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					// Check if the list already contains the common element
					if (!commonElements.contains(array1[i])) {
						// add the common element into the list
						commonElements.add(array1[i]);
					}
				}
			}
		}
		return commonElements;
	}

//9-------------------------------------------------------------------
	public void findPair(int[] array, int sum) {
		System.out.print("Pairs with  " + sum + " are ");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (sum == array[i] + array[j]) {
					System.out.print(" (" + array[i] + "," + array[j] + ")");
				}
			}
		}
		System.out.print("\n");
	}

	// 10------------------------------------------------------------------
	public int minSumPair(int[] arr) {
		Arrays.sort(arr);
		int sum = arr[0] + arr[1];
		return sum;
	}

}