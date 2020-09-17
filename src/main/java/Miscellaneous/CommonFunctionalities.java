package Miscellaneous;
import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shade.common.org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CommonFunctionalities {
	
	WebDriver driver;
	
	public CommonFunctionalities(WebDriver driver){

        this.driver = driver;

	}
	 public void toDragAndDrop(WebElement toDrag, WebElement toDrop, WebDriver driver ){
		
	    	
	    	 Actions act = new Actions(driver);
	       act.dragAndDrop(toDrag, toDrop).build().perform();

}

	 public void click(WebElement e) {
		 
		 e.click();
	 }
	 
	 public void start(){
			
			System.setProperty("webdriver.chrome.driver" , "/Users/ankitarora/Downloads/chromedriver");
			driver = new ChromeDriver();
		    String baseUrl = "http://formy-project.herokuapp.com/";
		    // launch Fire fox and direct it to the Base URL
		    driver.get(baseUrl);
} }
