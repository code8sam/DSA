package Easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumbersWithEvenNumberOfDigits {
	
	public static void main(String [] args) {
		int[] nums = {-12, 345, 2, 6, 7896};
		int evenNumberOfDigits = findNumbers(nums);
		System.out.println(evenNumberOfDigits);
	}

	private static int findNumbers(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(evenDigits(nums[i])) {
				count++;
			}
		}
		return count;
	}

	private static boolean evenDigits(int i) {
		
		// edge case: what if a number in the array is negative ? Fix --->
		if(i<0) {
			i = i*-1;
		}
		
		int count =0;
		while(i>0) {
			count++;
			i=i/10;
		}
		
		if(count%2 == 0) {
			return true;
		}
		return false;
	}

}
