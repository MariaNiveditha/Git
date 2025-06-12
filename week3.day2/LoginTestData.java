package week3.day2;

public class LoginTestData extends TestData {

	// create 2 methods in LoginTestData class
	
	public void enterUsername() {
		System.out.println("Enter Username");

	}
	
	public void enterPassword() {
		System.out.println("Enter Password");

	}
	public static void main(String[] args) {
		//Create object for TestData class and call methods
		TestData testData = new TestData();
		testData.enterCredentials();
		////Create object for LoginTestData class and call methods
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterUsername();
		loginTestData.enterPassword();
		
		testData.navigateToHomePage();
	}

}
