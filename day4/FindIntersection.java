package week1.day4;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare 2 arrays
		
		int arrData []= {3,4,5,7,8,9,11};
		int arrElem [] = {2,6,4,8,1,0,11};
		
		//get the length of the 2 arrays
		int arrDataLen = arrData.length;
		int arrElemLen = arrElem.length;
		
		var intOutput = "";
		
		for (int i=0;i<=arrDataLen-1;i++) {
			
			for (int j=0;j<=arrElemLen-1;j++) {
				
				//Compare two arrays elements one by one
				
				if (arrData[i]==arrElem[j]) {
					
					intOutput = intOutput +arrData[i]+"," ;
					
				}
				
			}
		}
		
		System.out.println("Intersection Values are "+intOutput);	
	}
}
