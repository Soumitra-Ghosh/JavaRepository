//https://youtu.be/Bn85ao1vvDM
//Uppercase to Lowercase conversion

package com.app.bean;

import java.util.Scanner;

public class UpparToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		System.out.print("Enter any character: ");
		Scanner r = new Scanner(System.in);
		
		ch = r.next().charAt(0);
		
		// .charAt is a method of string class, position 0 for default character 
		//r is a refrance of scanner class, .next is a method of scanner class,

		if(ch>'A' && ch<='Z')
		{
			char ch2=Character.toLowerCase(ch);
			System.out.println("Lower Case:"+ ch2);
		}
		else
		{
			char ch1=Character.toUpperCase(ch);
			System.out.println("Upper Case:"+ ch1);
		}
	}

}
