package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Load Leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Login to leaftaps
		//Enter username, password and click on login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Add wait time for 60 seconds
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Click on the "Accounts" button.
		driver.findElement(By.linkText("Accounts")).click();
		
		//Add wait time for 60 seconds
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation_mnc");
		
		//Enter a description as "Selenium Automation Tester
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		WebElement	industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryDropdown);
		industry.selectByValue("IND_SOFTWARE");
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement	ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipDropdown);
		ownership.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement	sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceDropdown);
		source.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement	marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(marketingDropdown);
		marketing.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement	stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateDropdown);
		state.selectByValue("TX");
		
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Add wait time for 200 seconds
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//Close Browser
		//driver.close();
	}

}
