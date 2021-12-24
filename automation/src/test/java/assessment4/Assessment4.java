package assessment4;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import generic.GenericLaunch;

public class Assessment4 extends GenericLaunch
{
	public WebDriver driver;
	
	@Test
	public void Searchkudoss() throws IOException, AWTException{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		driver.manage().window().maximize();
        SearchKudos ser = new SearchKudos(driver);
        ser.sendKeys("nagamani.ms@qualitestgroup.com");
        ser.sendKeys("P@ssw0rd");
		ser.click();
        ser.click();
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ser.kudSearch().sendKeys("nagamani.ms@qualitestgroup.com");
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		ser.searchbtn().click();

        driver.close();

		
	}	
	


}


