package Login_Page;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_With_Password {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://st.veris.in/login/NewLogin");
		
		
	}

}
