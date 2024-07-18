package week1.day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		// ArrayConcepts
		
		int arrNum[] = {2,5,7,7,5,9,2,3,8}; // by literal method
		// int arrI[] = new int [10]--by instantiation (Create object)
				
		//length of the array using "length" keyword (inbuilt)
		
		int arrLen = arrNum.length;
		System.out.println("Length of the Array is:- "+arrLen);
		
		//Sorting array using "sort" keyword (inbuilt)
		Arrays.sort(arrNum);
		System.out.println("After Sorting the least value is:- "+arrNum[0]);
		
		//Printing the array elements
		System.out.print("Array elements are:- ");
		
		for (int i=0; i<arrLen-1;i++) {
			
			System.out.print(arrNum[i]+" ");	
		}
		
		//Comparing the elements and getting the duplicate elements
		System.out.println("");
		System.out.print("Duplicate elements are:- ");
		
		for (int i=0; i<arrLen-1;i++) {//
			if (arrNum[i]==arrNum[i+1]) {
				
				System.out.print(arrNum[i]+" ");				
				
			}
			
		}
	}

}



