package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userspage {
	// Declaration
	@FindBy(xpath="//div[.='USERS']")
	private WebElement users;

	// initialize
	public Userspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilize
	public void searchtextbox() {
		users.click();
	}

	
}
