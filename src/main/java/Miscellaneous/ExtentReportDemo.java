package Miscellaneous;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	@Test
	
	public void loginTest() throws IOException {
		
		BasicConfigurator.configure();
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger= extent.createTest("Login");
		
		logger.log(Status.INFO, "Login");
		
		logger.log(Status.PASS, "Confirm");
		
		logger.fail("ScreenshotForFail", MediaEntityBuilder.createScreenCaptureFromPath("/Users/ankitarora/Desktop/download.jpeg").build());
		
		extent.flush();
		
		System.out.println("Hello World");
		
		
	}
	

}
