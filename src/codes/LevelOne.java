package codes;

public class LevelOne {

	// Main method
	public static void main(String[] args) {
		printNumbers();
		printEvenNumbers();
		checkOddEven();
		reverseNumber();
		sumOfDigits();
		palindrome();
		multiplicationTable();
		factorial();
		fibonacci();
		primeNumber();
	}

	// Print numbers from 1 to 10 using for loop.
	public static void printNumbers() {
		int limit = 10;
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
		}
	}

	// Print even numbers from 1 to 20.
	public static void printEvenNumbers() {
		int limit = 20;
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Check whether number is EVEN or ODD.
	public static void checkOddEven() {
		int input = 7;
		if (input % 2 == 0) {
			System.out.println(input + " is even number");
		} else {
			System.out.println(input + " is odd number");
		}
	}

	// Reverse a number
	public static void reverseNumber() {
		int input = 12345;
		String val = String.valueOf(input);
		for (int i = val.length() - 1; i >= 0; i--) {
			System.out.print(val.charAt(i));
		}
	}

	// Find sum of digits
	public static void sumOfDigits() {
		int input = 123;
		int sum = 0;
		String val = String.valueOf(input);
		for (int i = 0; i < val.length(); i++) {
			sum = sum + Character.getNumericValue(val.charAt(i));
		}
		System.out.println(sum);
	}

	// Palindrome Number
	public static void palindrome() {
		int input = 121;
		String val = String.valueOf(input);
		String reverse = "";
		for (int i = val.length() - 1; i >= 0; i--) {
			reverse = reverse + val.charAt(i);
		}
		if (val.equals(reverse)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is Not Palindrome");
		}
	}

	// Print multiplication table
	public static void multiplicationTable() {
		int input = 5;
		int limit = 10;
		for (int i = 1; i <= limit; i++) {
			int ans = input * i;
			System.out.println(input + "*" + i + "=" + ans);
		}
	}

	// Factorial Program
	public static void factorial() {
		int input = 5;
		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	// Fibonacci Series
	public static void fibonacci() {
	    int input = 5;
	    int first = 0;
	    int second = 1;
	    for (int i = 0; i < input; i++) {
	        System.out.print(first + " ");
	        int next = first + second;
	        first = second;
	        second = next;
	    }
	}
	
	// Fibonacci Series Array Version
	public static void fibonacciARR() {
	    int input = 5;
	    int[] numbers = new int[input];
	    numbers[0] = 0;
	    numbers[1] = 1;
	    for (int i = 2; i < input; i++) {
	        numbers[i] = numbers[i - 1] + numbers[i - 2];
	    }
	    for (int i = 0; i < input; i++) {
	        System.out.print(numbers[i] + " ");
	    }
	}
	
	// Prime Number check
	public static void primeNumber() {
	    int input = 7;
	    boolean isPrime = true;
	    for (int i = 2; i < input; i++) {
	        if (input % i == 0) {
	            isPrime = false;
	            break;
	        }
	    }
	    if (isPrime) {
	        System.out.println("Prime Number");
	    } else {
	        System.out.println("Not Prime Number");
	    }
	}
	
}
