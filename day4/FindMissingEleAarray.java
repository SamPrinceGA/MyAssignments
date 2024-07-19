package week1.day4;

import java.util.Arrays;

public class FindMissingEleAarray {

	public static void main(String[] args) {
		/* This program helps you practice array manipulation and looping in Java to find and print the first 
		missing element in an array. */
		
		int arrElements [] = {4,2,3,1,5,6,8,9,10,11,15,13,7};
		
		//Get the length of the array
		int arrEleLen = arrElements.length;
		var arrOutput = "";
		
		//Print the Array Elements
		for (int j=0;j<=arrEleLen-1;j++) {
			arrOutput = arrOutput+arrElements[j]+",";
		}
		System.out.println("Array Elements before Sorting:- "+arrOutput);
		
		arrOutput = "";
		
		//Sort the array first "Arrays.sort"
		Arrays.sort(arrElements);
		
		//Print the Array Elements after Sorting
		for (int j=0;j<=arrEleLen-1;j++) {
			arrOutput = arrOutput+arrElements[j]+",";
		}
		System.out.println("Array Elements After Sorting:- "+arrOutput);
		
		//Check if the iterator variable is not equal to the array values respectively 
		for (int i=0;i<=arrEleLen-1;i++) {
			
			int expVal = i+1;
			
			if (arrElements[i]!=expVal) {//1
				
				System.out.println("First missing element in a Array is:- "+expVal);
				break;
			}
		}

	}

}
