package objectModelPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(xpath="//*[@title='Blouse']")
	WebElement blouse; 

	//Initalizers
	
	public WebElement blouse() {
		return blouse; 
	}
	
		
}
