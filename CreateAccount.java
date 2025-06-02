package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(@href, '/crmsfa/control/main')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, '/crmsfa/control/accountsMain')]")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.xpath("//a[contains(@href, 'createContactForm')]")).click();
		//driver.findElement(By.xpath("//a[contains(@href, 'createAccountForm')]")).click();
		driver.findElement(By.id("accountName")).sendKeys("Ramya12345");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		Select dropdown = new Select(driver.findElement(By.name("industryEnumId")));
		dropdown.selectByIndex(3);
		Select dropdown1 = new Select(driver.findElement(By.name("ownershipEnumId")));
		dropdown1.selectByVisibleText("S-Corporation");
		Select dropdown2 = new Select(driver.findElement(By.name("dataSourceId")));
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		Select dropdown3 = new Select(driver.findElement(By.name("marketingCampaignId")));
		dropdown3.selectByIndex(6);
		
		Select dropdown4 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		dropdown4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		//String expectedName= driver.findElement(By.id("accountName")).getAttribute("value");
		//String actualName= "Ramya12345";
		//if (expectedName.equals(actualName)){
		//	System.out.println("Equals");
		//}
		//else {
		 //   System.out.println("Not Equal");
		//}
		
		
	}

}
