package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatient {

	WebDriver ldriver;
	
	public RegisterPatient(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="pat_fname")
	WebElement firstName;
	
	@FindBy(name="pat_lname")
	WebElement lastName;
	
	@FindBy(name="pat_dob")
	WebElement dob;
	
	@FindBy(name="pat_age")
	WebElement age;
	
	@FindBy(name="pat_addr")
	WebElement address;
	
	@FindBy(name="pat_phone")
	WebElement phone;
	
	@FindBy(name="pat_ailment")
	WebElement ailment;
	
	@FindBy(name="pat_type")
	WebElement type;
	
	@FindBy(xpath = "//*[@class='ladda-label']")
	WebElement button;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement afterRegister;
	
	public void setFirstName(String ename) {
		firstName.sendKeys(ename); 
	}
	
	public void setLastName(String elast) {
		lastName.sendKeys(elast);
	}
	
	
	public void setDOB(String dd, String mm, String yy) {
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
	}
	
	public void setAge(int x) {
		
		//Since sendKeys expects a String, String.valueOf(x) converts 
		//the integer x to a String so that it can be entered into the field
		age.sendKeys(String.valueOf(x));
	}
	
	public void setAddress(String add) {
		address.sendKeys(add);
	}
	
	
	public void setPhoneNumber(String num) {
		phone.sendKeys(num);
	}
	
	
	public void setAilgment(String type) {
		ailment.sendKeys(type);
	}
	
	
	public void setType(int a) {
		
		Select s = new Select(type);
		s.selectByIndex(a); 
	}
	
	public void clickButtin() {
		button.click();
	}
	
	public void patientRegistered() {
		afterRegister.click();
	}
	
}
