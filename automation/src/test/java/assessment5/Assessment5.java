package assessment5;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.GenericLaunch;
public class Assessment5 extends GenericLaunch
{
	public WebDriver driver;
	@BeforeMethod
	public void LoginFirst() {
		SendKudos sk = new SendKudos(driver);
		sk.sendKeys("nagamani.ms@qualitestgroup.com");
	    sk.sendKeys("P@ssw0rd");
		sk.click();
	}
	@Test //Valid
	public void SendKudos() throws AWTException{
		
		SendKudos sk = new SendKudos(driver);
        sk.click();
        sk.sendKeys("nagamani.ms@qualitestgroup.com");
        try {
		Thread.sleep(5000l);
		}
		catch(Exception e){
		e.printStackTrace();
		}
        Quali q = new Quali();
        q.keyPress(KeyEvent.VK_DOWN);
        q.keyPress(KeyEvent.VK_ENTER);
    sk.Taketab().click();
    try {
		Thread.sleep(2000l);
	}
	catch(Exception e){
			e.printStackTrace();
			}

    sk.Comments().sendKeys("Smart Worker");
    try {
		Thread.sleep(4000);
	}
	catch(Exception e){
	e.printStackTrace();
		}
	sk.Submit().click();
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