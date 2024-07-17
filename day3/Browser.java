package week1.day3;

public class Browser {
	
	public void launchBrowser (String browserName) {
		
		System.out.println("Browser launched successfully");
	}
	
	public void loadUrl () {
		
		System.out.println("Application url loaded successfully");
		
	}
	
	//public void browserVersion (int version) {
		//System.out.println(9);
		//}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser obj = new Browser ();
		obj.launchBrowser("Check Browser status");
		obj.loadUrl();
		//obj.browserVersion(8);

	}

}
