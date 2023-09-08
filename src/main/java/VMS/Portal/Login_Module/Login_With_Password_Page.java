package VMS.Portal.Login_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;

public class Login_With_Password_Page  extends AbstractComponent{
	

	WebDriver driver; 
	
	
	public Login_With_Password_Page(WebDriver driver)
	{
		
		super(driver);
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	
	
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
WebElement loginEmail;


@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
WebElement loginPassword;


@FindBy(css="button[type='submit'] span")
WebElement loginButton;


public void loginToPortal(String email, String password)
{
	
	loginEmail.sendKeys(email);
	loginPassword.sendKeys(password);
	loginButton.click();
	
}
public void goTo() {
	
	driver.get("https://st.veris.in/login/NewLogin");
	
}

}
