package objectModelPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenSubpage {

	WebDriver driver;

	public WomenSubpage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement ShortSleeveTshirt; 
	
	@FindBy(xpath="//*[@class='button ajax_add_to_cart_button btn btn-default']")
	WebElement AddToCartButton; 
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	WebElement ProceedToCheckoutButton; 
	
	@FindBy(xpath="//*[@id='product_price_1_1_0']/span")
	WebElement ProductPriceInCart; 
	
	//Initalizers
		
	public WebElement ShortSleeveTshirt() {
		return ShortSleeveTshirt; 
		
	}
	
	public WebElement AddToCartButton() {
		return AddToCartButton; 
		
	}
	
	public WebElement ProceedToCheckoutButton() {
		return ProceedToCheckoutButton; 
		
	}
	
	public WebElement ProductPriceInCart() {
		return ProductPriceInCart; 
		
	}
	
}
