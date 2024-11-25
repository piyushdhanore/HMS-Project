package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoViewPatient {

	@Test
	public void viewPatient() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		
		driver.findElement(By.id("emailaddress")).sendKeys("admin@mail.com");
		
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		
		driver.findElement(By.xpath("//span[contains(text(),'Patients')]")).click();
		
		driver.findElement(By.linkText("View Patients")).click();
		
		
List<WebElement> pageLinks = driver.findElements(By.xpath("(//li[contains(@class,'footable-page')])[position()>=3 and position()<=9]"));
		
		
		for(WebElement page : pageLinks) {
			page.click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
}
