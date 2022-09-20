package com.app.java;

public class MultipleStaticBlock {
	
	static int a;  // static member
	static
	{
		a=10; // we can initialized the static member within static block
		System.out.println(a);  
		System.out.println("1st static");
	}
	
	static
	{
		System.out.println("2nd static");
	}

	public static void main(String[] args) {
		
		System.out.println("My main");

	}
	
	static
	{
		System.out.println("3rd static");
	}

	/*all static class will execute first,
	 * we used static method when we want to execute
	 * the code at the time of class execution, Like native methods
	 * static block is used to initialized the static member.
	 * 
	 * */
}
