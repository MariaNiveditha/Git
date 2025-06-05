package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class FacebookSignup {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Load facebook URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Click create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Add wait time for 60 seconds
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//Enter First name and last name
		driver.findElement(By.name("firstname")).sendKeys("Maria");
		driver.findElement(By.name("lastname")).sendKeys("Niveditha");
		
		//Select date from date dropdown
		
		WebElement	birthday = driver.findElement(By.name("birthday_day"));
		
		Select date = new Select(birthday);
		date.selectByIndex(17);
		
		//Select month from month dropdown
		
		WebElement	birthmonth = driver.findElement(By.name("birthday_month"));
				
		Select month = new Select(birthmonth);
		month.selectByValue("9");
		
		//Select year from year dropdown
		
		WebElement	birthyear = driver.findElement(By.name("birthday_year"));
						
		Select year = new Select(birthyear);
		year.selectByValue("1993");
		
		//Select Gender as female
		
		driver.findElement(By.className("_8esa")).click();
		
		//Enter remaining fields and Submit
		driver.findElement(By.name("reg_email__")).sendKeys("marianive18@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Maria1993");
		driver.findElement(By.name("websubmit")).click();
		
	}

}
