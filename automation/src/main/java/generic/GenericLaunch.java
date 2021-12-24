package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericLaunch {
	
	public WebDriver driver;
	
@BeforeMethod
	public void launchChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 this.driver = new ChromeDriver();
	}

	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}
}
