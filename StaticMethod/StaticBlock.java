package com.app.java;

public class StaticBlock {
	
	static
	{
		System.out.println("Hello world");
	}

	// do not need to call static method, it called automatically, when call is loaded in the memory
	// static block will execute first, after that main block will executed
	/* in java 1.6 version or prior 1.6 version static block can executed without main method,
	from 1.7 version it required main method*/
	
	public static void main(String[] args) {
	
	System.out.println("Hello main");	
		

	}

}
