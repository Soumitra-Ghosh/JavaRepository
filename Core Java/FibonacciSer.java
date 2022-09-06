package JavaObject;

public class FibonacciSer {

	public static void main(String[] args) {
		
		int a = 0, b = 1;
		int c;
		
		 /* 0 1 1 2 3 5 8 13 21 34 55 89 ,  
		  0+1=1 
		  1+1 = 2
		  1+2 = 3
		  2+3 = 5  and so on
		   *
		   *
		   *
		   */
		
		System.out.print("Fibonacci number are: "+ a + " " + b );  
		
		for(int i = 1; i <= 10; i++ )
		{
			c= a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}

	}

}
