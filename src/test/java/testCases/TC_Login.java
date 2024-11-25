package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;

public class TC_Login extends BaseClass{

	@Test
	public void loginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickButton();
	}
}
