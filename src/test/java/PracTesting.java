import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class PracTesting {
	
	WebDriver driver;
	
	@Test
    public void test1() throws InterruptedException, AWTException 
	{
        // declaration and instantiation of objects/variables
    	
	
		
		System.setProperty("webdriver.chrome.driver" , "/Users/ankitarora/Downloads/chromedriver");

    	driver = new ChromeDriver();
		
        String baseUrl = "http://formy-project.herokuapp.com/";
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//// Auto Complete
        
        
        
        
//   WebElement autoComplete = driver.findElement(By.xpath("//li/a[@href='/autocomplete']"));
//   
//        
//        autoComplete.click();
//        
//        WebElement address = driver.findElement(By.xpath("//input[@placeholder='Enter address']"));
//        address.sendKeys("abcd");
//        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip code']"));
//        zipCode.sendKeys("1234");
//        
//        driver.navigate().back();
        
        
//        
//// Buttons
//        
        
        
//        WebElement buttons = driver.findElement(By.xpath("//li/a[@href='/buttons']"));
//        buttons.click();
//        
//        
//        WebElement dropDown = driver.findElement(By.id("btnGroupDrop1"));
//        dropDown.click();
        
        
        
 // Checkbox
        
        
//        WebElement checkBox = driver.findElement(By.xpath("//li/a[@href='/checkbox']"));
//   
//        
//        checkBox.click();
//        
//WebElement radioBtn = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
//   
//        
//radioBtn.click();
  
        
//        WebElement datePicker = driver.findElement(By.xpath("//li/a[@href='/datepicker']"));
//      
//           
//        datePicker.click();
//        
//        WebElement dateBox = driver.findElement(By.xpath("//input[@id='datepicker']"));
//        
//        
//        dateBox.click();
        
        
        
// DRAG AND DROP
        
        
        
//        WebElement dragDrop = driver.findElement(By.xpath("//li/a[@href='/dragdrop']"));
//        dragDrop.click();
//        
//        WebElement selLogo = driver.findElement(By.xpath("//img[@alt='Selenium logo']"));
//        WebElement target = driver.findElement(By.xpath("//div[@id='box']"));
//
//        
//        
//        Actions act = new Actions(driver);
//        Thread.sleep(5000);
//        act.dragAndDrop(selLogo, target).build().perform();
        
        
 //DROP DOWN
        
//        WebElement dropDwn = driver.findElement(By.xpath("//li/a[@href='/dropdown']"));
//        dropDwn.click();
//        
//        WebElement drop = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
//        drop.click();
//        
//        Thread.sleep(3000);
//        
//        WebElement cwf = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@href='/form']"));
//        cwf.click();
        
  
        
        
 // FILE UPLOAD
        
//        WebElement fileUpld = driver.findElement(By.xpath("//li/a[@href='/fileupload']"));
//        fileUpld.click();
//        
//        WebElement choose = driver.findElement(By.xpath("//button[text()='Choose']"));
//        choose.click();
//        
//File file = new File("/Users/ankitarora/Downloads/After Resume.docx");
// 
//StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
// 
////Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
// 
//Robot robot = new Robot();
// 
//// Cmd + Tab is needed since it launches a Java app and the browser looses focus
// 
//robot.keyPress(KeyEvent.VK_META);
// 
//robot.keyPress(KeyEvent.VK_TAB);
// 
//robot.keyRelease(KeyEvent.VK_META);
// 
//robot.keyRelease(KeyEvent.VK_TAB);
// 
//robot.delay(500);
//       
//    }

        
 
 // Large Page Content
        
   
//    
//        WebElement lpc = driver.findElement(By.xpath("//li/a[@href='/scroll']"));
//        lpc.click();
//        
//        driver.manage().window().maximize();
//        
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)");

        
 
 // Radio button
        
//        WebElement rdb = driver.findElement(By.xpath("//li/a[@href='/radiobutton']"));
//      rdb.click();
//        
//        WebElement rdo = driver.findElement(By.xpath("//label[text='Radio button 1']"));
//      rdo.click();
//        
        
        
        
//   SWITCH WINDOW
        
//        WebElement swt = driver.findElement(By.xpath("//li/a[@href='/switch-window']"));
//      swt.click();
//        
//      WebElement ont = driver.findElement(By.xpath("//button[@id='new-tab-button']"));
//      ont.click();
//      
//      ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//      driver.switchTo().window(tabs2.get(1));
//      WebElement autoComplete = driver.findElement(By.xpath("//li/a[@href='/autocomplete']"));
//      autoComplete.click();      
//      driver.switchTo().window(tabs2.get(0));
//      Thread.sleep(3000);
//      WebElement alt = driver.findElement(By.xpath("//button[@id='alert-button']"));
//      alt.click();
//        driver.switchTo().alert().accept();
        
        
        
        
        
        
        
        
        
}}
	

