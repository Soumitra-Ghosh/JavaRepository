/* Binary to Decimal number*/

/* (1011) = (11)
 * 
 * 1*2^0 + 1*2^1 + 0*2^2 + 1*2^3
 *  
 * 
 * 

*/
package com.app.bean;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a binary number : ");
		int num = in.nextInt();
		
		int d = 0;
		int t = num;
		int i=0;
		
		while(t>0)
		{
			int r = t%10;
			t = t/10;
			d = d + r * (int) Math.pow(2, i++);
			
		}
		System.out.println("Decimal number is :"+d);
	}
}
