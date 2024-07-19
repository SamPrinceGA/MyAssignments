package week1.day3;

public class IsPrime {
	
	
	//Check the given no is prime or not
	
	
	 public static void main(String[] args) {
			
			//Check the given no is prime or not
		 
		 var flag = 0;
		 int iNo = 17;
		 
			for (int j=2; j<iNo; j++) {
				
				if (iNo % j ==0) {
					
					flag = 0;
					break;
				}
				else {
					
					flag = 1;
									
				}
			}
			
			if (flag == 1) {
				System.out.println(iNo+ " is a Prime Number");
			}
			else {
				System.out.println(iNo+ " is a not Prime Number");
				}				
		}
}
