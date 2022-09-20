package com.app.java;

//https://youtu.be/qRCEdWQ0f4Q
/*if i used static, and if i changed value for one variable, then it will be same for all object
 * all object are sharing same value if i used static
 * */

 class StaticV {
	
	int id;
	String name;
	static String subject;
	
	StaticV()
	{
		id = 19;
		name = "Rsn";
	}
	
	public void show()
	{
		System.out.println(id+","+name+","+subject);
	}
	
	static
	{
		subject = "computer";
	}
}	
	public class StaticMethodVariable1 {
	
	public static void main(String[] args) {
		
		StaticV soumitra = new StaticV();
	//	soumitra.id = 8;
	//	soumitra.name = "Priya";
	//	soumitra.subject = "CST";
		
		StaticV s1 = new StaticV();
	//	s1.id = 12;
	//	s1.name = "Susmita";
	//	s1.subject = "IT";
		
		soumitra.show();
		s1.show();
		
		
		
	}
	

}
