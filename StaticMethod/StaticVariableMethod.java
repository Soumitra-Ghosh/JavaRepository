package com.app.java;

public class StaticVariableMethod {
	
	int i = 12;
	static int a = 10;  // static method can access only static data
	static void display()
	{
		System.out.println(a);
	}
	
	// static method don't take any this
	
	void show()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		display();
		
		StaticVariableMethod oj = new StaticVariableMethod();
		oj.show();
		

	}

}
