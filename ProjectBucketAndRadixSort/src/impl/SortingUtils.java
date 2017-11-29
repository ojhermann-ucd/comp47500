package impl;

import java.lang.reflect.Array;
import java.util.Random;

import core.List;

public class SortingUtils {

	public static void main(String[] args) {
		// ibstTest()
		ibsTest();

		// irsTest()
		irsTest();

		// srsTest()
		srsTest();

	}

	@SuppressWarnings("unchecked")
	public static void singleDigitBucketSort(List<Integer> list) {
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, 10);

		// Step 1: Copy the values from the list into the buckets.
		while (!list.isEmpty()) {
			int value = list.remove(list.first());
			if (value < 0 || value > 9)
				throw new UnsortableException("The list contains an invalid value: " + value);
			if (buckets[value] == null) {
				buckets[value] = new LinkedList<Integer>();
			}
			buckets[value].insertLast(value);
		}

		// Step 2: Copy the values from the buckets to the list.
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				while (!buckets[i].isEmpty()) {
					list.insertLast(buckets[i].remove(buckets[i].first()));
				}
			}
		}
	}

	public static void integerBucketSort(List<Integer> list, int lower, int upper) {
		/*
		 * Reduced to a double pass counting sort
		 * 
		 * O(n) time complexity, where n is number of integers
		 * 
		 * O(n) space complexity, where n is number of integers
		 */

		// countingArray: array that will hold count of occurrences of integers in list, inclusive of lower and upper
		int[] countingArray = new int[upper - lower + 1];

		// remove elements of list and increment the count in the appropriate index of arrayCount
		while (!list.isEmpty()) {
			// get integer value from list
			int listInt = list.remove(list.first());
			if (listInt < lower || upper < listInt) {
				// exception if listInt is out of range
				throw new UnsortableException("This list contains an invalid value: " + listInt);
			} else {
				// map all integers, inclusive of lower and upper, to an appropriate slot in the array
				countingArray[listInt - lower]++;
			}
		}

		// list: populate with sorted values via countArray by adding an integer value (index) countArray[index] times
		int index = lower;
		for (int count : countingArray) {
			for (int j = 0; j < count; j++) {
				list.insertLast(index);
			}
			index++;
		}
	}

	public static void ibsTest() {

		// list
		List<Integer> list = new LinkedList<Integer>();

		// random number: rn
		Random rn = new Random();

		// populate list with 500 random values from [50, 250]
		for (int j = 0; j < 500; j++) {
			list.insertLast(rn.nextInt(201) + 50);
		}

		// general announcement
		System.out.println("This is ibsTest()\n");
		System.out.println("500 random values from [50, 250]\n");

		// print state of the list before sorting
		System.out.print(String.format("%-10s ", "unsorted: "));
		for (int listInt : list) {
			System.out.print(String.format("%5s ", listInt));
		}
		System.out.println("\n");

		// print state of the list after sorting
		integerBucketSort(list, 50, 250);
		System.out.print(String.format("%-10s ", "sorted: "));
		for (int listInt : list) {
			System.out.print(String.format("%5s ", listInt));
		}
		System.out.println("\n\n");
	}

	public static void integerRadixSort(List<Integer> list, int digits) {

		/*
		 * Reduced to a double pass counting sort
		 * 
		 * O(n) time complexity, where n is number of integers
		 * 
		 * O(n) space complexity, where n is number of integers
		 * 
		 * transform digits into lower and upper and then pass to
		 * itegerBucketSort()
		 */

		// use size of the counting array to determine lower and upper inputs to pass into integerBuckerSort
		int base = 10;
		int arraySize = 1;
		for (int j = 0; j < digits; j++) {
			arraySize *= base;
		}
		int maxInt = arraySize - 1;
		int minInt = maxInt * -1; // calculate maxInt first to minimise overflow potential from subtraction

		// call integerBucketSort()
		integerBucketSort(list, minInt, maxInt);
	}

	public static void irsTest() {

		// list
		List<Integer> list = new LinkedList<Integer>();

		// random number: rn
		Random rn = new Random();

		// populate list with 500 random values that are at most 3 digits i.e. [-999,999]
		for (int j = 0; j < 500; j++) {
			list.insertLast(rn.nextInt(1000 + 999) - 999);
		}

		// general announcement
		System.out.println("This is irsTest()\n");
		System.out.println("500 random values from [-999, 999]\n");

		// print state of the list before sorting
		System.out.print(String.format("%-10s ", "unsorted: "));
		for (int listInt : list) {
			System.out.print(String.format("%5s ", listInt));
		}
		System.out.println("\n");

		// print state of the list after sorting
		integerRadixSort(list, 3);
		System.out.print(String.format("%-10s ", "sorted: "));
		for (int listInt : list) {
			System.out.print(String.format("%5s ", listInt));
		}
		System.out.println("\n\n");
	}

	public static void srsTest() {

		System.out.println("This is srsTest()\n");

		System.out.println("String array sorted with varying values of digits");
		System.out.println("e.g. digits = 2 sorts by first two characters in string\n");

		// populate the list
		List<String> list = new LinkedList<String>();
		String[] InputArray = { "ab", "aa", "a", "the", "big", "black", "cat", "sat", "on", "the", "beautiful", "brown", "mat" };
		int maxString = 0;
		for (String s : InputArray) {
			list.insertLast(s);
			if (maxString < s.length()) {
				maxString = s.length();
			}
		}
		System.out.print(String.format("%-15s", "unsorted: "));
		for (String s : list) {
			System.out.print(String.format("%-15s", s));
		}
		System.out.println("\n");

		for (int j = 0; j < maxString + 1; j++) {

			List<String> tempList = list;
			stringRadixSort(tempList, j);
			System.out.print(String.format("digits = %-6d", j));
			for (String s : tempList) {
				System.out.print(String.format("%-15s", s));
			}
			System.out.println("\n");
		}
	}

	@SuppressWarnings("unchecked")
	public static void stringRadixSort(List<String> list, int digits) {
		/*
		 * LSD radix sort for strings: starts at the index = digits
		 * 
		 * At each pass decrement digits
		 * 
		 * If digits > string.length(), emulate uniform length
		 * 
		 * Intentionally did not mimic this:
		 * https://www.cs.princeton.edu/~rs/AlgsDS07/18RadixSort.pdf
		 * 
		 * It's very nice, but copying would be shitty
		 * 
		 * O(dn) time complexity, where d = digits, n = number of strings
		 * 
		 * O(n) space complexity, n = number of strings
		 */

		// maxChar
		int maxChar = 0; // allows for creation of buckets for sorting the strings
		for (String inputString : list) {
			for (int j = 0; j < inputString.length(); j++) {
				maxChar = maxChar < inputString.charAt(j) ? inputString.charAt(j) : maxChar;
			}
		}

		// charArray: acts as buckets for character values found in the strings
		List<String>[] charArray = (List<String>[]) Array.newInstance(List.class, maxChar);
		for (int j = 0; j < charArray.length; j++) {
			charArray[j] = new LinkedList<String>();
		}

		// bucket each string based on char value at index, right to left across the sting from digits to zero
		for (int j = digits - 1; -1 < j; j--) {
			stringRadixSortInner(list, j, charArray);
		}

	}

	public static void stringRadixSortInner(List<String> list, int index, List<String>[] charArray) {
		/*
		 * Core of stringRadixSort
		 * 
		 * Double pass counting sort to bucket strings by the character at index
		 * 
		 * O(n) time complexity, O(m) space complexity, where m < n, normally m << n
		 */

		// populate buckets by the value of the character in the string at index
		List<String> smallList = new LinkedList<String>();
		while (!list.isEmpty()) {
			String listString = list.remove(list.first());
			if (index > listString.length() - 1) { 
				smallList.insertLast(listString);
			} else {
				Character listCharacter = listString.charAt(index);
				int listInt = Character.getNumericValue(listCharacter);
				charArray[listInt].insertLast(listString);
			}
		}

		// list: put the values bucketed by the character at index
		while(!smallList.isEmpty()) {
			list.insertLast(smallList.remove(smallList.first()));
		}
		for (List<String> currentList : charArray) {
			while (!currentList.isEmpty()) {
				list.insertLast(currentList.remove(currentList.first()));
			}
		}
	}
}
