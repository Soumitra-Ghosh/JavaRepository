// Convert Character to string
package com.app.bean;

public class ConvertCharToString {

	public static void main(String[] args) {
	
		char c= 's';  // for single type character we will used character variable
		
		//type 1
		String s1 = Character.toString(c);
		
		//type 2
		String s2 = String.valueOf(c);
		
		System.out.println("The string is: "+ s1);
		System.out.println("The string is: "+ s2);

	}

}
