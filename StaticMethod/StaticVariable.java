package com.app.java;


/* we can not used static variable with the local variable
 we can used static keyword with inner class or nested class
 we can not use static keyword in outer class
 
*/
public class StaticVariable {
	
	int a=20; //Instance variable
	static int i = 10; // static variable, it is a class level variable
	
	void display()
	{
		int b = 2;  // local variable, we can not declared this to static
	}

	public static void main(String[] args) {
		
		System.out.println(StaticVariable.i);  // we can do this, don't need to create object
	//	System.out.println(StaticVariable.a);  // we can not do this, we need to create object

	}

}
