package codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LevelFive {

	public static void main(String[] args) {
		findEvenNumbers();
		findOddNumbers();
		findMinimumNumber();
		findSecondLargest();
		removeDuplicateNumber();
		
	}

	// find the even number using stream
	public static void findEvenNumbers() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(result);
	}

	// find the odd number using stream
	public static void findOddNumbers() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> result = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(result);
	}

	// find the maximum number using stream
	public static void findMaximumNumber() {
		List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);
	}

	// find the minimum number using stream
	public static void findMinimumNumber() {
		List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);
		int min = list.stream().min(Integer::compare).get();
		System.out.println(min);
	}

	// find the second largest number using stream
	public static void findSecondLargest() {
		List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);
		int secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);
	}

	// remove duplicate number using stream
	public static void removeDuplicateNumber() {
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
	}

	// sort ascending order using stream
	public static void sortAscending() {
		List<Integer> list = Arrays.asList(5, 3, 8, 1);
		List<Integer> result = list.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
	}

	// sort descending order using stream
	public static void sortdescending() {
		List<Integer> list = Arrays.asList(5, 3, 8, 1);
		List<Integer> result = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
	}

	// convert names to Upper case using stream
	public static void convertUppercase() {
		List<String> list = Arrays.asList("java", "spring", "boot");
		List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
	}

	// count the element using stream
	public static void countElement() {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		long count = list.stream().count();
		System.out.println(count);
	}
}
