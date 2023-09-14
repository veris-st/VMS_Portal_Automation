package VMS.Portal.Login_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponent;

public class login_With_OTP extends AbstractComponent{
	
	WebDriver driver; 

	public login_With_OTP(WebDriver driver) {
		super(driver);
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
@FindBy(xpath="//p[contains(@class,'login-signin-switch')]")
WebElement clickOnSing_with_OTP_Button;


@FindBy(xpath="//input[@type='text']")
WebElement enterEmailIdforOTPRequest;
	

@FindBy(css="//span[contains(text(),'OTP')]")
WebElement clickOnOTPButton;

@FindBy(css="input[placeholder='Enter OTP *']")
WebElement Enter_OTP_Received_On_Email;

@FindBy(xpath="//span[contains(text(),'Continue')]")
WebElement clickOnContinue_Button;


public void login_With_OTP(String email, String OTP){
	
	clickOnSing_with_OTP_Button.click();
	enterEmailIdforOTPRequest.sendKeys(email);
	clickOnOTPButton.click();
	Enter_OTP_Received_On_Email.sendKeys(OTP);
	clickOnContinue_Button.click();
	
}


}
