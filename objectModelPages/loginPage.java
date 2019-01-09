package objectModelPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(name="email")
	WebElement username; 

	@FindBy(id="passwd")
	WebElement password; 
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton; 
	
	String URL = "http://automationpractice.com/index.php?controller=authentication";
	
	//Initalizers
	
	public void openURL() {
		driver.get(URL);
		
	}
	
	public WebElement username() {
		return username; 
	}
	
	public WebElement password() {	
		return password; 
	}
	
	public WebElement submitButton() {
		return submitButton;
	}
	
	public String urlString() {
		return URL; 
	}
	
}
