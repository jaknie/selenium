package objectModelPages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitemapPage {

	WebDriver driver;

	public SitemapPage(WebDriver driver){
	    PageFactory.initElements(driver, this);
	    this.driver = driver;
	} 
	
	//WebElements 
	
	@FindBy(xpath="//div[@class='sitemap_block box']")
	WebElement ourOffers; 
	
	String URL = "http://automationpractice.com/index.php?controller=sitemap"; 
	
	//Initalizers
	public void openURL() {
		driver.get(URL);
		
	}
	
	public WebElement ourOffers() {
		return ourOffers; 
		
	}
	
	public List<WebElement> ourOffersLinks() {
		List<WebElement> ourOffersLinks = ourOffers.findElements(By.tagName("a")); 
		return ourOffersLinks; 
		
	}
	
		
}
