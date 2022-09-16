// Convert feet to meter

package com.app.bean;

import java.util.Scanner;

public class ConvertFeedToMeter {

	public static void main(String[] args) {
		
		double feet;
		double meter;
		
		Scanner inp = new Scanner(System.in);
		System.err.println("Enter a value for feet: ");
		feet = inp.nextDouble();
		
		meter = feet * 0.305;
		
		System.out.println(feet + " is " + meter);
	}

}
