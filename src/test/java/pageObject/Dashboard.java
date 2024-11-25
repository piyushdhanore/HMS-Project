package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),' Patients ')]")
	WebElement patient;
	
	@FindBy(xpath = "//a[text()='Register Patient']")
	WebElement register;
	
	@FindBy(xpath ="//a[contains(text(),'View Patients')]")
	WebElement searchPatient;
	
	public void clickPatient() {
		patient.click();
	}
	
	public void registerPatient() {
		register.click();
	}
	
	public void viewPatient() {
		searchPatient.click();
	}
	
	
	
	
	
	
}
