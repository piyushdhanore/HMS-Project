package testCases;

import org.testng.annotations.Test;

import pageObject.Dashboard;
import pageObject.LoginPage;
import pageObject.RegisterPatient;

public class TC_RegisterPatient extends BaseClass {

	
	@Test(priority = 0)
	public void login() {
		
		//here TC_loginpage is already created but in java, classes doesn't support multiple inheritance.
				// we're already inherting baseclass, so we cannot inherit another class
				LoginPage lp = new LoginPage(driver);
				lp.setUsername(username);
				lp.setPassword(password);
				lp.clickButton();
				
				Dashboard hm = new Dashboard(driver);
				hm.clickPatient();
				hm.registerPatient();
	}
	
	@Test
	public void registerPatient() {
		
		RegisterPatient rp = new RegisterPatient(driver);
		
		rp.setFirstName("Biggus");
		rp.setLastName("Diggus");
		rp.setDOB("10", "03", "1998");
		rp.setAge(27);
		rp.setAddress("Karachi");
		rp.setPhoneNumber("8380944363");
		rp.setAilgment("Cold");
		rp.setType(1);
		rp.clickButtin();
		rp.patientRegistered();
		
	}
	
	
}
