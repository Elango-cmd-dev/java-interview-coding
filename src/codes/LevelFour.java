package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LevelFour {

	public static void main(String[] args) {
		addArrayList();
		reverseArrayList();
		removeDeplicate();
		findFrequency();
		sortArraylist();
		sortArraylistOther();
		findDuplicate();
		selectionSort();
		checkMissingNumber();
		moveZerosToEnd();
		findSumOfPair();
		findSecondLargest();
	}

	// ArrayList-la elements add panni print pannu
	public static void addArrayList() {
		ArrayList<String> input = new ArrayList<String>();
		input.add("SPRINGBOOT");
		input.add("JAVA");
		input.add("MYSQL");
		for (String tech : input) {
			System.out.println(tech);
		}
	}

	// ArrayList reverse iteration
	public static void reverseArrayList() {
		ArrayList<Integer> value = new ArrayList<>();
		value.add(10);
		value.add(40);
		value.add(20);
		value.add(30);
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = value.size() - 1; i >= 0; i--) {
			ans.add(value.get(i));
		}
		System.out.println(ans);
	}

	// Remove duplicate elements from ArrayList
	public static void removeDeplicate() {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);
		input.add(40);
		input.add(20);
		input.add(30);
		input.add(10);
		input.add(10);
		Set<Integer> setValue = new LinkedHashSet<>();
		for (int val : input) {
			setValue.add(val);
		}
		System.out.println(setValue);
	}

	// Find frequency of each element using HashMap
	public static void findFrequency() {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);
		input.add(30);
		input.add(20);
		input.add(30);
		input.add(10);
		input.add(10);
		Map<Integer, Integer> mapValue = new HashMap<>();
		for (int num : input) {
			if (mapValue.containsKey(num)) {
				mapValue.put(num, mapValue.get(num) + 1);
			} else {
				mapValue.put(num, 1);
			}
		}
		System.out.println(mapValue);
	}

	// Sort ArrayList ascending order [In-build method]
	public static void sortArraylist() {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);
		input.add(40);
		input.add(20);
		input.add(30);
		Collections.sort(input);
		System.out.println(input);
	}

	// Sort ArrayList ascending order [not using In-build method]
	public static void sortArraylistOther() {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);
		input.add(40);
		input.add(20);
		input.add(30);
		for (int i = 0; i < input.size() - 1; i++) {
			for (int j = i + 1; j < input.size(); j++) {
				if (input.get(i) > input.get(j)) {
					int temp = input.get(i);
					input.set(i, input.get(j));
					input.set(j, temp);
				}
			}
		}
		System.out.println(input);
	}

	// Find duplicate elements in ArrayList
	public static void findDuplicate() {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);
		input.add(20);
		input.add(10);
		input.add(30);
		input.add(20);
		Map<Integer, Integer> mapValue = new HashMap<>();
		for (int val : input) {
			mapValue.put(val, mapValue.getOrDefault(val, 0) + 1);
		}
		System.out.println("Duplicate Elements:");
		for (Map.Entry<Integer, Integer> entry : mapValue.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	// Bubble Sort
	public static void bubbleSort() {
		int[] input = { 40, 10, 30, 20 };
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		for (int num : input) {
			System.out.print(num + " ");
		}
	}

	// Selection Sort
	public static void selectionSort() {
		int[] input = { 40, 10, 30, 20 };
		for (int i = 0; i < input.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			int temp = input[i];
			input[i] = input[minIndex];
			input[minIndex] = temp;
		}
		for (int num : input) {
			System.out.print(num + " ");
		}
	}

	// Check Missing Number
	public static void checkMissingNumber() {
		int[] input = { 1, 2, 3, 5 };
		int check = 1;
		for (int i = 0; i < input.length; i++) {
			if (check != input[i]) {
				System.out.println("Missing Number : " + check);
				break;
			}
			check++;
		}
	}

	// Move all zeros to end
	public static void moveZerosToEnd() {
		int[] input = { 1, 0, 2, 0, 3, 0 };
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				input[index] = input[i];
				index++;
			}
		}
		while (index < input.length) {
			input[index] = 0;
			index++;
		}
		System.out.println(Arrays.toString(input));
	}

	// Find pair with given sum
	public static void findSumOfPair() {
		int[] input = { 2, 7, 11, 15 };
		int target = 9;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == target) {
					System.out.println(input[i] + " + " + input[j] + " = " + target);
				}
			}
		}
	}

	// Find second largest without sorting
	public static void findSecondLargest() {
	    int[] input = {10, 50, 20, 80, 30};
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    for (int num : input) {
	        if (num > largest) {
	            secondLargest = largest;
	            largest = num;
	        } else if (num > secondLargest && num != largest) {
	            secondLargest = num;
	        }
	    }
	    System.out.println("Largest Number : " + largest);
	    System.out.println("Second Largest Number : " + secondLargest);
	}
	
	// Find maximum occurring character
	public static void findMaxOccurringCharacter() {
	    String input = "programming";
	    Map<Character, Integer> freq = new LinkedHashMap<>();
	    for (char ch : input.toCharArray()) {
	        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
	    }
	    int maxCount = 0;
	    for (int count : freq.values()) {
	        if (count > maxCount) {
	            maxCount = count;
	        }
	    }
	    System.out.println("Maximum Frequency : " + maxCount);
	    System.out.print("Character(s) : ");
	    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
	        if (entry.getValue() == maxCount) {
	            System.out.print(entry.getKey() + " ");
	        }
	    }
	}
}
