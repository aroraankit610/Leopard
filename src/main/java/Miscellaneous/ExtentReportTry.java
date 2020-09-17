package Miscellaneous;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.log4j.BasicConfigurator;
import org.codehaus.plexus.languages.java.jpms.ResolvePathResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTry {
	
	
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	

	
	@BeforeMethod
	public void Setup() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn.html");
		
		 extent = new ExtentReports();
		
		 extent.attachReporter(reporter);
		
		 logger= extent.createTest("Login");
		
	}
	
	@Test
	
public void loginTest() throws IOException {
		
		System.setProperty("webdriver.chrome.driver" , "/Users/ankitarora/Downloads/chromedriver");

		driver = new ChromeDriver();
	
		
		driver.get("http://formy-project.herokuapp.com/");
		
		System.out.println("Title is "+driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Formy"));
}
	
	@AfterMethod
	public void TearDown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			String temp = Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

		}
		
		extent.flush();
		
	}
	
	
	
	
	

}
