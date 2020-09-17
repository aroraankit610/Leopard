import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Miscellaneous.CommonFunctionalities;
import Miscellaneous.Utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragAndDropTest {
		public WebDriver driver;
		DragAndDrop objDragAndDrop;
		CommonFunctionalities c;
		ExtentReports extent;
		ExtentTest logger;
		
		@BeforeMethod
		public void Setup() {
			
			
			String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/DragAndDropTest"+timeStamp+".html");
			
			 extent = new ExtentReports();
			
			 extent.attachReporter(reporter);
			
			 logger= extent.createTest("Login");
			
		}
		
		@AfterMethod
		public void TearDown(ITestResult result) throws IOException {
			
	if(result.getStatus()==ITestResult.SUCCESS) {
				
				String temp = Utility.getScreenshot(driver);
				
				logger.pass("Screen", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

			}
			
			if(result.getStatus()==ITestResult.FAILURE) {
				
				String temp = Utility.getScreenshot(driver);
				
				logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

			}
			driver.close();
			extent.flush();
		}
		

		@Test
		

		public void testDragAndDrop() throws InterruptedException {
		
				
				System.setProperty("webdriver.chrome.driver" , "/Users/ankitarora/Downloads/chromedriver");
				driver = new ChromeDriver();
			    String baseUrl = "http://formy-project.herokuapp.com/";
			    // launch Fire fox and direct it to the Base URL
			    driver.get(baseUrl);
			    
			    objDragAndDrop  = new DragAndDrop(driver);
			   
			    objDragAndDrop.dragAndDropClick();
			    Thread.sleep(3000);			    

}}
