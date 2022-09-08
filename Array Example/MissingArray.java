package com.array.app;

public class MissingArray {

	public static void main(String[] args) {
		
		int[] arr= {1,4,6,3,2};    // 1+2+3+4+6 = 16, 21+5 = 21(sum with missing number)
		
		int expected_no_elements = arr.length + 1;  // 1,2,3,4,5,6
		int total_sum = expected_no_elements*(expected_no_elements + 1)/2; // 6*7/2 = 21
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(total_sum - sum);
	}

}
