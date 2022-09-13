package com.app.java;

/*              1  2  3  4
 *            
 *            1 *  *  *  *        
 * 			  2 *  *  *     
 * 			  3 *  *  
 * 			  4 *  
 * 
 * 
 * */

public class StarPattarn_reverse {

	public static void main(String[] args) {

		for(int i = 1; i<=4; i++)
		{
			for(int j = 4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
