package week1.day3;

public class FibonacciSeries {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.
		
		int n = 10;
		int a = 0;
		int b = 1;
		
		int c = 0+1;
		
		System.out.print(a+",");
		System.out.print(b+",");
		
		
		for (int i=0; i<n; i++) {
			
			System.out.print(c+",");
			a=b;
			b=c;
			c=a+b;
			
					
		}
		
	}

}
