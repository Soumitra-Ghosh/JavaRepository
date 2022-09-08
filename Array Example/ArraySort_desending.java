/*find 2nd largest element in array with sorting */
package com.array.app;
import java.util.Arrays;

public class ArraySort_desending {

	public static void main(String[] args) {
	
		int[] arr = {1,2,5,8,3,5,1,4};
		
		int temp;
		
		
		for(int i = 0; i<arr.length; i++)  // this for loop is for the 0 index of array
		{
			for(int j = i+1; j<arr.length; j++)  // this loop for the 1 index of array
			{
				if(arr[i] < arr[j]) // if this ifCondition is satisfied, then i will swap the value of j to i
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
				/* you can change the < to > for assending order*/
			}
		
		}
		
		System.out.println("2nd largest element is : " + arr[1]);


		Arrays.sort(arr);
		System.out.print("sorted array is : ");
		
			for(Integer i : arr) {
			System.out.print(i + " ");
		}
	}

}
