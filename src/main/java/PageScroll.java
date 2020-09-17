import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageScroll {
	

    WebDriver driver;

    @FindBy(xpath="//li/a[@href='/scroll']")
    WebElement pageScroll;
    
    @FindBy(xpath="//input[@placeholder='Enter address']")
    WebElement address;
    
    @FindBy(xpath="//input[@placeholder='Zip code']")
    WebElement zipCode;
    
  
    public PageScroll(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    public void pageScroll() {
    	
    	pageScroll.click();
    }
    
    public void maximizing() {
    	
    	driver.manage().window().maximize();
    }
    
    public void scrollDown() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    	
    }

}
