/*Convert integer to string*/

package com.app.bean;

public class IntToString {

	public static void main(String[] args) {
	
		int a = 10;
		String b = Integer.toString(a);
		System.out.println("Convert int to string :" + b);
		
		String c = String.valueOf(a);
		System.out.println("Convert into String :" + c );
		
		String d = String.format("%d", a);   //%d for integer, we will convert a integer
		System.out.println("Using String.format: "+ d);
	}

}
