package Login_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import VMS.Portal.Login_Module.Login_With_Password_Page;

public class Login_With_Password {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://st.veris.in/login/NewLogin");
		Thread.sleep(15000);
		
        // Get the current URL after the potential redirection
        String currentUrl = driver.getCurrentUrl();

        // Define the expected URL after redirection
        String expectedUrl = "https://st.veris.in/login/NewLogin"; 
        
        // Perform the validation
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("URL redirection is correct.");
        } else {
            System.err.println("URL redirection is incorrect. Current URL: " + currentUrl);
        }		
        
        
        Login_With_Password_Page login_With_Password_Page = new Login_With_Password_Page(driver);
        login_With_Password_Page.goTo();
        
        login_With_Password_Page.loginToPortal("shailendra.tiranga@veris.in", "Digicred4Passw0rd@12345");
      

	
		//driver.quit();
		
			}

}
