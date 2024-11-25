package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;

public class BaseClass {

	ReadConfig config = new ReadConfig();
	String url = config.getApplicationUrl();
	String username = config.getUsername();
	String password = config.getPassword();
	
	static WebDriver driver; 
	
	@BeforeClass
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();
	}
}
