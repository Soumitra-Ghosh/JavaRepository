package com.app.bean;

public class CharArrayToString {

	public static void main(String[] args) {
	
		// we will take a character array
		
		char ch[] = {'a','b','c'}; // collection of all the character in the form of array
		
		// type 1
		String s1=String.valueOf(ch);
		System.out.println("Charecter to string: "+ s1);
		
		//type 2
		String s2 = new String(ch); // initialized the string
		System.out.println("Charecter to string, 2nd from: "+ s2);
		
	}

}
