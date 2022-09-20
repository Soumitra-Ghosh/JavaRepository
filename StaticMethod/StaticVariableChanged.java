package com.app.java;

public class StaticVariableChanged {
	
	int rollno;
	String name;
	static String collage="TPI";
	
	// constructor to initialized the variable
	
	StaticVariableChanged(int roll, String nm)
	{
		this.rollno = roll;
		this.name = nm;
	//    this.collage = clg;
	}
	
	static void change()
	{
		collage="IEM";
	}
 
	public void display()
	{
		System.out.println(rollno+" , "+name+" , "+collage);
	}
	
	public static void main(String[] args) {
	
		StaticVariableChanged.change();
		
		StaticVariableChanged stv = new StaticVariableChanged(111,"abcd");
	    stv.display();
	    

		StaticVariableChanged stv1 = new StaticVariableChanged(121,"abcd");
	    stv1.display();
		
		
		
	}

}
