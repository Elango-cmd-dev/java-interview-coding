package codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LevelThree {

	public static void main(String[] args) {
		reverseString();
		checkPalindrome();
		checkVowel();
		countStringWord();
		removeSpaces();
		countFrequency();
		findDuplicate();
		checkAnagram();
		getNonRepeatedChar();
	}

	// Reverse a String
	public static void reverseString() {
		String input = "hello";
		StringBuilder reverse = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse.append(input.charAt(i));
		}
		System.out.println(reverse);
	}

	// Check String Palindrome
	public static void checkPalindrome() {
		String input = "madam";
		boolean isPalindrome = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println(input + " is palindrome");
		} else {
			System.out.println(input + " is not palindrome");
		}
	}

	// Count Vowels
	public static void checkVowel() {
		String input = "education";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = Character.toLowerCase(input.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowel Count : " + count);
	}

	// Count Words in String
	public static void countStringWord() {
		String input = " Java Spring   Boot  ";
		if (input == null || input.trim().isEmpty()) {
			System.out.println("Word Count : 0");
			return;
		}
		String[] words = input.trim().split("\\s+");
		System.out.println("Word Count : " + words.length);
	}

	// Remove Spaces
	public static void removeSpaces() {
		String input = "Java Spring Boot";
		String[] words = input.trim().split("\\s+");
		// String result = input.replaceAll("\\s+", "");simple version
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word);
		}
		System.out.println(sb);
	}

	// Count Character Frequency
	public static void countFrequency() {
		String input = "hello";
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch) + 1);
			} else {
				freq.put(ch, 1);
			}
		}
		System.out.println(freq);
	}

	// Find Duplicate Characters
	public static void findDuplicate() {
		String input = "programming";
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (char ch : input.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		System.out.println("Duplicate Characters:");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	// Convert Lowercase to Uppercase
	public static void changeUppercase() {
		String input = "java";
		System.out.println(input.toUpperCase());
	}

	// Anagram Check
	public static void checkAnagram() {
		String str1 = "listen";
		String str2 = "silent";
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	// First Non-Repeated Character
	public static void getNonRepeatedChar() {
		String input = "swiss";
		Map<Character, Integer> freq = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		System.out.print("First Non-Repeated Character : ");
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
				break;
			}
		}
	}

	// Find Longest Word
	public static void findLongestWord() {
	    String input = "Java SpringBoot Microservices";
	    String[] words = input.trim().split("\\s+");
	    String longestWord = words[0];
	    for (int i = 1; i < words.length; i++) {
	        if (words[i].length() > longestWord.length()) {
	            longestWord = words[i];
	        }
	    }
	    System.out.println("Longest Word : " + longestWord);
	}
}
