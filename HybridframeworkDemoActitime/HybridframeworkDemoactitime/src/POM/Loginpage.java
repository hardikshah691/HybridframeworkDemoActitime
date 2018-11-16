package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    //Declaration
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
   //initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	
	public void emailtextbox(String name)
	{
		username.sendKeys(name);
	}
	public void passwordtextbox(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
	
}
