package com.app.java;

public class StaticMethod {
	
	static void show()
	{
		System.out.println("ststic 1");
	}

	public static void main(String[] args) {
	
		//it is a one process, don't need to create any object , you can call through class name directly
		show();
		
	//	StaticMethod.show();  // you can do both

		Xyz.display(); 
		/* in this case, if we create another class then
		 *  we have to call the static method with the class name
		 */	
	}
}

class Xyz
{
	static void display()
	{
		System.out.println(" static 1");
	}
}
