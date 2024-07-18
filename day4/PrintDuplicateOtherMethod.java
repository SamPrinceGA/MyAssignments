package week1.day4;

public class PrintDuplicateOtherMethod {

	public static void main(String[] args) {
		// Find the Duplicate without using sort
		
		int arrData [] = {3,4,5,5,3,7,8,9,1,2,6,7};
		
		for (int i=0; i<arrData.length-1;i++) {
			
			for (int j=i+1;j<arrData.length;j++) {
				
				if (arrData[i]==arrData[j]) {
					System.out.println(arrData[i]);
				}
			}
		}
			
		
		

	}

}
