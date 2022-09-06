package JavaObject;

public class Factorial {

	public static void main(String[] args) {

		int factorial = 1;
		
		int num = 6 ; // 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720 
		
		for(int i= 1; i <= num; i ++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is "+ factorial);

	}

}
