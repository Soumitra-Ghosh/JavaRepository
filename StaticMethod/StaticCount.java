//https://youtu.be/uJHlGeEA7Aw
package com.app.java;

public class StaticCount {
	
	//int count = 0;
	static int count = 0;
	
	StaticCount()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		StaticCount c1=new StaticCount();
		StaticCount c2 = new StaticCount();
		StaticCount c3=new StaticCount();

	}

}
