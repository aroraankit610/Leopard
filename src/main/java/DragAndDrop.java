import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {

	
    WebDriver driver;

    @FindBy(xpath="//li/a[@href='/dragdrop']")
    WebElement dragAnddrop;
    
    @FindBy(xpath="//img[@alt='Selenium logo']")
    WebElement toDrag;
    
    @FindBy(xpath="//div[@id='box']")
    WebElement toDrop;
    
  
    public DragAndDrop(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    
    public void dragAndDropClick() {
    	
    	dragAnddrop.click();
    }
}
