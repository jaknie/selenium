package objectModelPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(id="search_query_top")
	WebElement searchfield; 
	
	@FindBy(name="submit_search")
	WebElement submitSearch; 
	
	@FindBy(linkText="Women")
	WebElement womenLink; 
	
	String URL = "http://automationpractice.com"; 

	//Initalizers
	
	public void openURL() {
		driver.get(URL);
		
	}
	
	public WebElement searchfield() {
		return searchfield; 
	}
		
	public WebElement submitSearch() {
		return submitSearch; 
		
	}
	
	public WebElement womenLink() {
		return womenLink; 
		
	}
	
}
