// convert string to character array
package com.app.bean;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "I love Soumitra";
		
		char[] ch = word.toCharArray(); // converting string to character array // character is not holding any value yet
		System.out.println(Arrays.toString(ch));
	}

}
