package objectModelPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(id="product_1_1_0_0")
	WebElement product1; 
	
	//Initalizers
  
	public WebElement product1() {
		return product1; 
		
	}
	
	
}
