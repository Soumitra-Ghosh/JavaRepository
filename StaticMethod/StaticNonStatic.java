// static method can applied in non static method

package com.app.java;

public class StaticNonStatic {
	
	static int num=100;
	static String str = "Soumitra Ghosh";
	
	static void display()
	{
		System.out.println("static number: " + num);
		System.out.println("static name: "+ str);
	}
	
	void show()
	{
		display();
	}

	public static void main(String[] args) {
		
		display();
		
		StaticNonStatic st = new StaticNonStatic();
		st.show();

	}

}
