/* Write a program to find second largest element in a given Array in java? */

package com.array.app;

import java.util.SortedSet;
import java.util.TreeSet;

public class ArraySort_Assending_Collection {

	public static void main(String[] args) {
	
		int[] arr = {1,5,3,1,9,6,4,3};
		
		SortedSet<Integer> s = new TreeSet<>();
		
		for(Integer i : arr)
		{
			s.add(i);
		}

		System.out.println(s);
		
		/*here i did, 
		  1. first i remove the duplicate elements  then 
		  2. sorting the array by using Sortedset.
		      set does not allow duplicate elements, and 
		  3. after sorting remove the largest(last) element, 
		  4. then print the last element, which is the 2nd large element. 
		 * */
		
		s.remove(s.last());
	//	System.out.println(s);
		
		System.out.println(s.last());
		
	}

}
