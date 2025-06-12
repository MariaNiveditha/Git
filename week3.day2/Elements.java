package week3.day2;

//Elements class inherit from the Button subclass
public class Elements {

	public static void main(String[] args) {

		WebElement webElement = new WebElement();
		webElement.setText("Welcome");
		webElement.click();

		Button button = new Button();
		button.submit();
	}

}
