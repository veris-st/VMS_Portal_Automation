package abstractComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class AbstractComponent {
	
	WebDriver driver;
	

	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		// TODO Auto-generated constructor stub
	}

}
