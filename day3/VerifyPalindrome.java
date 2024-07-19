package week1.day3;

public class VerifyPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Check whether the given input and the output are equal. If they are equal, then the given input is a Palindrome 
		and if not, the given input is not a Palindrome.*/
		
		//declare the string / Reverse the string and compare the both
		
		String sInput = "Malayalam";
		System.out.println("Given Input:- "+sInput);
		var sOutput = "";
		
		//getting char one by one using "toCharArray"
		char[] cArr = sInput.toCharArray();
		
		//for (int i=0;i<cArr.length -1;i++) {
		
		for (int i=cArr.length-1;i>=0 ;i--) {
			
			sOutput = sOutput + cArr[i];//reverse the input and stored in output variable
			
		}
		System.out.println("Given Output After Reverse:- "+sOutput);
		
		//Comparing input and output by using "equalsIgnoreCase"
		if (sInput.equalsIgnoreCase(sOutput)) {
			System.out.println("The given string is a 'Palindrom'");
		}
		else {
			System.out.println("The given string is not a 'Palindrom'");
		}
				
		}
				
	}


