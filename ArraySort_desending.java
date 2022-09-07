package com.array.app;

public class ArraySort_desending {

	public static void main(String[] args) {
	
		int[] arr = {1,2,5,8,3,5,1,4};
		
		int temp;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]< arr[j]) // if this ifCondition is satisfied, then i will swap the value of j to i
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

	}

}
