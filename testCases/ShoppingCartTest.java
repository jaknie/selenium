package testCases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import objectModelPages.CartPage;
import objectModelPages.HomePage;
import objectModelPages.WomenSubpage;

public class ShoppingCartTest {

	private WebDriver driver; 
	
	@Before
	public void driverInitialize() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jknie\\eclipse-workspace\\POMexample\\ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	}
		
	@Test
	public void login() throws InterruptedException {
				
		HomePage HomePage = new HomePage(driver); 
		WomenSubpage WomenSubpage = new WomenSubpage(driver); 
		CartPage CartPage = new CartPage(driver);
		
		//Open homepage 
		HomePage.openURL(); 
		
		//Go to Women section subpage 
		HomePage.womenLink().click();

		//Hover the mouse over the product so the "Add to cart" button could appear 
		Actions action = new Actions(driver); 
		action.moveToElement(WomenSubpage.ShortSleeveTshirt()).build().perform();
		
		//Add the product to the cart
		WomenSubpage.AddToCartButton().click();
		
		Thread.sleep(2000);
		
		//Click on "Proceed to checkout" button 
		WomenSubpage.ProceedToCheckoutButton().click();
		
		//Check if product is displayed in cart
		if (CartPage.product1().isDisplayed()) {
			
		//If product is displayed, print text confirmation in the console
			System.out.println("Product successfully added to cart");
			
		}
		
		//If product is not displayed, print text confirmation in the console
		else {
			System.out.println("Product unsuccesfully added to cart");
			
		}		
		
	}
			
		@After
			public void windowQuit() {
			driver.quit();
		}		
}