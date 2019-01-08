package testCases;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectModelPages.HomePage;
import objectModelPages.SearchPage;

public class SearchTest {

	private WebDriver driver; 
	
	@Before
	public void driverInitialize() {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		}
	
	@Test
	public void login() throws InterruptedException {
				
		HomePage HomePage = new HomePage(driver); 
		SearchPage SearchPage = new SearchPage(driver);
		
		//Open home page 
		HomePage.openURL();
		
		//Enter "blouse" string into search field 
		HomePage.searchfield().sendKeys("blouse");
		
		//Click on search button 
		HomePage.submitSearch().click();
		
		Thread.sleep(5000);
		
		//Assert used to check if the imgage is displayed in search results
		Assert.assertTrue(SearchPage.blouse().isDisplayed());
		}
		
	@After
	public void windowQuit() {
		driver.quit();	
		}
						
	}
