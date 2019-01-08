package testCases;
import java.util.Iterator;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectModelPages.SitemapPage;

public class SitemapLinksCheck {

	private WebDriver driver; 
	
	@Before
	public void driverInitialize() {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void login() throws InterruptedException {
				
		SitemapPage SitemapPage = new SitemapPage(driver);
		
		//Open base URL 
		SitemapPage.openURL();
		
		//Count number of links on specified site map section
		int linksCount = SitemapPage.ourOffersLinks().size(); 
		
		System.out.println("In 'Our Offers' section in Sitemap there are totally " + linksCount + " links visible");
		
		//for loop to open all links from the section in new tabs 
		for (int i=1; i<linksCount; i++){
			
			String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
			SitemapPage.ourOffers().findElements(By.tagName("a")).get(i).sendKeys(newtab);
			Thread.sleep(2000L);
		}	
		
			//get the handle of the window that WebDriver is currently controlling 
			Set<String>abc = driver.getWindowHandles(); 
			
			//set iterator to navigate through different windows (tabs)
			Iterator<String> it = abc.iterator(); 
		
			//while loop to switch through windows 
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				
				//print title of each page
				System.out.println(driver.getTitle());
			}; 
		
	}	
		
		@After
		public void windowQuit() {
			driver.quit();
		}		
}
