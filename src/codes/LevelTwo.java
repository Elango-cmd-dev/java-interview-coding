package codes;

public class LevelTwo {

	public static void main(String[] args) {
		countNumberOfDigits();
		findLargestNumber();
		swapTwoNumbers();
		armstrongNumber();
		findGCD();
		findLCM();
		findLargestElementArray();
		findSecondLargestElementArray();
		getSumOfArray();
		getReverseArray();
		linearSearch();
	}

	// Count number of digits.
	public static void countNumberOfDigits() {
		int input = 12345;
		int count = 0;
		while (input != 0) {
			input = input / 10;
			count++;
		}
		System.out.println(count);
	}

	// Find largest among 3 numbers
	public static void findLargestNumber() {
		int[] input = { 10, 25, 8 };
		int largestNumber = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > largestNumber) {
				largestNumber = input[i];
			}
		}
		System.out.println("The Largest Number is: " + largestNumber);
	}

	// Swap two numbers WITHOUT third variable
	public static void swapTwoNumbers() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

	// Check Armstrong Number
	public static void armstrongNumber() {
		int input = 153;
		int original = input;
		int sum = 0;
		int digits = String.valueOf(input).length();
		while (input != 0) {
			int digit = input % 10;
			sum += Math.pow(digit, digits);
			input = input / 10;
		}
		if (original == sum) {
			System.out.println(original + " is Armstrong Number");
		} else {
			System.out.println(original + " is Not Armstrong Number");
		}
	}

	// Find GCD / HCF of two numbers
	public static void findGCD() {
		int a = 12;
		int b = 18;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		System.out.println("GCD is: " + a);
	}

	// Find LCM of two numbers
	public static void findLCM() {
		int a = 12;
		int b = 18;
		int num1 = a;
		int num2 = b;
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		int gcd = num1;
		int lcm = (a * b) / gcd;
		System.out.println("LCM: " + lcm);
	}

	// Find largest element in array
	public static void findLargestElementArray() {
		int[] input = { 10, 50, 20, 80, 30 };
		int largeNumber = input[0];
		for (int i = 1; i < input.length; i++) {
			if (largeNumber < input[i]) {
				largeNumber = input[i];
			}
		}
		System.out.println("Largest element in this array is :" + largeNumber);

	}

	// Find second largest element in array
	public static void findSecondLargestElementArray() {
		int[] input = { 10, 50, 20, 80, 30 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < input.length; i++) {
			if (input[i] > largest) {
				secondLargest = largest;
				largest = input[i];
			} else if (input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		System.out.println("Second largest element in this array is :" + secondLargest);
	}

	// Find sum of array elements
	public static void getSumOfArray() {
		int[] input = { 1, 2, 3, 4 };
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		System.out.println("The sum of array value is :" + sum);
	}

	// Reverse an array
	public static void getReverseArray() {
		int[] input = { 1, 2, 3, 4 };
		int[] reverse = new int[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			reverse[count] = input[i];
			count++;
		}
		System.out.print("Reverse array is : ");
		for (int num : reverse) {
			System.out.print(num + " ");
		}
	}
	
	// Reverse an array without create another array
	public static void getReverseArrayAnother() {
		int[] input = { 1, 2, 3, 4 };
		int left = 0;
		int right = input.length - 1;
		while (left < right) {
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;

			left++;
			right--;
		}
		System.out.println("Reverse array is : ");
		for (int num : input) {
			System.out.print(num + " ");
		}
	}
	
	//Linear Search
	public static void linearSearch() {
		int[] input = {10,20,30,40};
		int searchNumber = 30;
		for(int num:input) {
			if(searchNumber == num) {
				System.out.println("Element found! :"+ num);
				break;
			}
		}
	}
}
