package assessment2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import generic.GenericLaunch;

	public class Assessment2 extends GenericLaunch{
	public WebDriver driver;
	@Test
	public void basepageNav() throws AWTException{
		
     RecentContact con = new RecentContact(driver);
     con.clickRc().click();
     con.Taketab().click();
    try {
	Thread.sleep(5000l);
	}
	catch(Exception e){
	e.printStackTrace();
	}
    con.Comments().sendKeys("Smart Worker");
    try {
    Thread.sleep(5000l);
	}
	catch(Exception e){
	e.printStackTrace();
	}
	con.Submit().click();
	con.closebtn().click();
	}
	@BeforeMethod
	public void fin() {
    RecentContact con = new RecentContact(driver);
	 con.Clickusername().sendKeys("nagamani.ms@qualitestgroup.com");
	 con.ClickPassword().sendKeys("P@ssw0rd");
	 con.ClickLogin().click();
	}
	@BeforeClass
	public void findurl() throws Exception {
		
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void submitt() {
		driver.close();
		
	}
	
}
