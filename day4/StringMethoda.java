package week1.day4;

public class StringMethoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non-Premitive data type
		/*Java String class provides a lot of methods to perform operations on strings such as compare(), 
		concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
		
		There are two ways to create String object:

			By string literal
			By instantiation (creating object using new keyword)
		String objects are stored in a special memory area known as the "string constant pool".
		
		*/
		////String Compare --
		//equals
		String strData = "Happy4Learning6Selenium";
		String strData1 = "Happy4Learning6Selenium";
		
		System.out.println(strData.equals(strData1));//Case Sensitive
		
		// equalsIgnoreCase
		
		String strData2 = "Happy4Learnings6Selenium";
		String strData3 = "Happy4Learnings6selenium";
		System.out.println(strData2.equalsIgnoreCase(strData3));
		
		//contains
		
		String str = "Learnings";
		String str1 = "Happy4Learnings6selenium";
		System.out.println(str1.contains(str));
		
		//length
		
		System.out.println(str1.length());
		
		//toUpperCase & toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//Convert String to Integer
		
		String sNo = "1000";
		System.out.println(sNo+50);//before converting
		int nNo = Integer.parseInt(sNo);//Converting String to integer
		
		System.out.println(nNo+50);;//After converting
		
		//replace
		String sRp = "This is the test message";
		String rePlaceStr = sRp.replace("s","x");
		System.out.println(rePlaceStr);
		
		//replace all
		
		String rPlaceAll = "This is themostusedinAutomationscenarios 12345";
		String reDigit = rPlaceAll.replaceAll("[a-zA-Z]","");//
		System.out.println(reDigit);
		
		//Split
		String sRap = "This is the test message for split";
		String [] arrWords = sRap.split(" ");//Split by Space or we can put "\\s" 
		
		for (int i=0;i<arrWords.length-1;i++) {
			
			System.out.println(arrWords[i]);
			
		}
		
		//toCharAray
		
		String sStr = "SamPrince";
		char [] arrChr = sStr.toCharArray();
		
		for (int i=0;i<arrChr.length-1;i++) {
			
			System.out.println(arrChr[i]);
			
		}
	}

}
