 /* Write a program to check whether two given Arrays are equal,
 *  given both contains same data type and same length ?*/
package com.array.app;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
	
		int[] arr1 = {1,5,8,3};
		int[] arr2 = {3,6,4,8};
		int[] arr3 = {4,7,1,3};
		int[] arr4 = {4,7,1,3};
		
		System.out.println(Arrays.equals(arr3, arr4));

		System.out.println(Arrays.equals(arr1, arr2));
	}

}
