package testCases;

import org.testng.annotations.Test;

import pageObject.Dashboard;
import pageObject.LoginPage;
import pageObject.ViewPatient1;

public class TC_ViewPatient extends BaseClass {

	@Test(priority = 0)
	public void loginTest1() {
		
		//here TC_loginpage is already created but in java, classes doesn't support multiple inheritance.
		// we're already inherting baseclass, so we cannot inherit another class
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickButton();
		
		Dashboard db = new Dashboard(driver);
		db.clickPatient();
		db.viewPatient();
		
	}
	
	@Test
	public void findPatient() throws InterruptedException {
		
		ViewPatient1 vm1 = new ViewPatient1(driver);
		
		vm1.viewAndClick("rutu ravan	");
		
	}
}
