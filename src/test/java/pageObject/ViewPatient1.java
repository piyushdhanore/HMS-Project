package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPatient1 {

	WebDriver ldriver;

	public ViewPatient1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//li[contains(@class, 'footable-page')])[position()>=3 and position()<=8]")
	List<WebElement> pageNumbers;

	@FindBy(xpath = "//table[@id='demo-foo-filtering']//tbody")
	List<WebElement> patientTable;

	public void viewAndClick(String pName) {

		boolean patientFound = false;

		for (WebElement page : pageNumbers) {

			for (int i = 0; i < patientTable.size(); i++) {

				WebElement fullName = patientTable.get(i)
						.findElement(By.xpath("//table//tbody//tr[" + (i + 1) + "]//td[2]"));
				String name = fullName.getText();

				if (name.equalsIgnoreCase(pName)) {
					System.out.println("This patient: " + name + " is registered.");
					WebElement viewButton = patientTable.get(i)
							.findElement(By.xpath("//table//tbody//tr[" + (i + 1) + "]//td[8]"));
					viewButton.click();
					patientFound = true;
					break; // Breaks out of the inner loop
				}
			}

			if (patientFound) {
				break; // Breaks out of the outer loop
			}

			page.click();
		}
	}

//	// this method is check if the pageNumbers are changing or not
//	public void pageNation() throws InterruptedException {
//
//		for (int i = 3; i <= 8; i++) {
//	        // Re-fetch the elements each time
//	        WebElement page = ldriver.findElement(By.xpath("(//li[contains(@class, 'footable-page')])[" + i + "]"));
//	        page.click();
//	        Thread.sleep(2000);
//	    }
//	}

}





