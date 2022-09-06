package JavaObject;

import java.util.Scanner;

public class FactorialScanner {

	public static void main(String[] args) {
		
		int f = 1;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			f = f*i;
		}
		System.out.println("factorial is : "+ f);

	}

}
