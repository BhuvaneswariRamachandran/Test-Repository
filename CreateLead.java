/**
 * 
 */
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * 
 */
public class CreateLead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(@href, '/crmsfa/control/main')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhuvaneswari");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ramachandran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();


	}

}
