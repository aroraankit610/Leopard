import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindow {
	
	 WebDriver driver;

	    @FindBy(xpath="//li/a[@href='/switch-window']")
	    WebElement switchWindow;
	    
	    @FindBy(xpath="//button[@id='new-tab-button']")
	    WebElement openNewTabBtn;
	    
	    @FindBy(xpath="//button[@id='alert-button']")
	    WebElement alertBtn;
	    
	  
	    public SwitchWindow(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	    
	    public void switchWindoww() {
	    	
	    	switchWindow.click();
	    }
	    
	    public void maximizing() {
	    	
	    	driver.manage().window().maximize();
	    }
	    
	    public void openNewTabBtn() throws InterruptedException {
	    	
	    	Thread.sleep(4000);
	    	
	    	openNewTabBtn.click();
	    }
	    
	    public void alertBtn() throws InterruptedException {
	    	Thread.sleep(3000);
	    	alertBtn.click();
	    	driver.switchTo().alert().accept();
	    }
}
