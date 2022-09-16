// convert String to integer

package com.app.bean;

public class StringToIntreger {

	public static void main(String[] args) {
		
		String s = "1234";
		
		// type 1
		int n1 = Integer.parseInt(s);
		System.out.println("Convert String to Integer :" + n1);
		
		
		// type 2
		int n2 = Integer.valueOf(s);
		System.out.println(" String to int conversion, Integer.valueOf : " + n2);
		
		
		//type 3
		int n3 = new Integer(s).intValue();
		System.out.println("Convert string to int using new Integer(s) : " + n3);
		

	}

}
