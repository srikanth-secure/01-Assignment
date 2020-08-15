package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Assignment_01 {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 5, 5, 6, 6, 7, 2 };
		AssignmentMethods allAssignmentMethods = new AssignmentMethods();
		// 1
		allAssignmentMethods.printOriginalArray(1, originalArray);
		Set<Integer> s = allAssignmentMethods.printDuplicateArray(originalArray);
		System.out.println("Duplicate Elements are : " + s);

		// 2
		allAssignmentMethods.printOriginalArray(2, originalArray);
		System.out.println("Unique elements array is : " + allAssignmentMethods.removeDuplicateArray(originalArray));

		// 3
		int[] Array1 = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		allAssignmentMethods.printOriginalArray(3, Array1);
		System.out.println("The sum of " + allAssignmentMethods.removeDuplicateArray(Array1) + " is "
				+ allAssignmentMethods.uniqueElementsSum(Array1));
		int[] Array2 = { 1, 1, 3, 2, 2, 3 };
		allAssignmentMethods.printOriginalArray(0, Array2);
		System.out.println("The sum of " + allAssignmentMethods.removeDuplicateArray(Array2) + " is "
				+ allAssignmentMethods.uniqueElementsSum(Array2));

		// 4
		int[] Array4 = { 6, 8, 1, 9, 2, 1, 10 }, Array5 = { 1, 2, 3, 0 };
		int result, position = 10;
		allAssignmentMethods.printOriginalArray(4, Array4);
		result = allAssignmentMethods.returnPositionElement(Array4, position);
		System.out.println(result > 0 ? "The " + position + " largest element is " + result
				: "Invalid Input, array size is less than ," + position);
		position = 3;
		allAssignmentMethods.printOriginalArray(0, Array5);
		result = (allAssignmentMethods.returnPositionElement(Array5, position));
		System.out.println(result > 0 ? "The " + position + " largest element is " + result
				: "Invalid Input, array size is less than ," + position);

		// 5
		int[] diffArray = { 9, 2, 12, 5, 4, 7, 3, 19, 5 };
		allAssignmentMethods.printOriginalArray(5, diffArray);
		System.out.print("The difference of Max and Min numbers is ");
		System.out.println(allAssignmentMethods.maxDifference(diffArray));

		// 6
		int[] minMaxArray = { 1, 2, 5, 5, 6, 6, 7, 2 };
		allAssignmentMethods.printOriginalArray(6, minMaxArray);
		System.out.print("The Min and Max numbers are ");
		System.out.println(Arrays.toString(allAssignmentMethods.minMaxArray(minMaxArray)));

		// 7
		int[] secondMinMaxArray = { 1, 2, 5, 9, 6, 4, 7, 2 };
		allAssignmentMethods.printOriginalArray(7, secondMinMaxArray);
		System.out.print("The Second Min and Second Max numbers are ");
		System.out.println(Arrays.toString(allAssignmentMethods.secondMinMax(secondMinMaxArray)));

		// 8
		int[] array1 = { 1, 5, 10, 20, 40, 80 };
		int[] array2 = { 6, 7, 20, 80, 100 };
		int[] array3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
		allAssignmentMethods.printOriginalArray(8, array1);
		allAssignmentMethods.printOriginalArray(0, array2);
		allAssignmentMethods.printOriginalArray(0, array3);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1 = allAssignmentMethods.findCommonElements(array1, array2);
		list2 = allAssignmentMethods.findCommonElements(array3, array2);
		list1.retainAll(list2);
		System.out.print("Common elements in three arrays are ");
		System.out.println(list1);

		// 9
		int arr[] = { 3, 6, 8, -8, 10, 8 };
		allAssignmentMethods.printOriginalArray(9, arr);
		allAssignmentMethods.findPair(arr, 16);

		// 10
		int[] arr1 = { 1, 7, 2, 9, 6 };
		allAssignmentMethods.printOriginalArray(10, arr1);
		System.out.println("Minium pair sum is " + allAssignmentMethods.minSumPair(arr1));
	}
}
