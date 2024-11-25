package testCases;

import org.testng.annotations.Test;

import pageObject.Dashboard;
import pageObject.LoginPage;

public class TC_Dashboard extends BaseClass {

	@Test
	public void loginTest1() {
		
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
}
