package assessment3;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.GenericLaunch;
public class Assessment3 extends GenericLaunch{
	public WebDriver driver;
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		driver.manage().window().maximize();
	
	}

    @Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password) {
		
	LoginPage l = new LoginPage(driver);
      l.sendKeys(Username);
      l.sendKeys(Password);
	 l.click(); 
	   }
    
    @AfterTest
    public void closeatEnd() {
    	
    	
    	  driver.close();
    }
	
 @DataProvider
public Object[][] getData() throws Exception
{
	Object[][] data = new Object[1][2];
	
	data[0][0] = "nagamani.ms@qualitestgroup.com";
	data[0][1] = "P@ssw0rd";
	return data;
  }
}
