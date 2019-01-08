package testCases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectModelPages.loginPage;


public class loginTest {

	private WebDriver driver; 
	
	@Before
	public void driverInitialize() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jknie\\eclipse-workspace\\POMexample\\ChromeDriver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void login() {
		
		loginPage loginPage = new loginPage(driver); 
		
		//Open base URL
		loginPage.openURL();

		//Enter login 
		loginPage.username().sendKeys("login1");
		
		//Enter password 
		loginPage.password().sendKeys("newPassword");
		
		//Click on login button to log in 
		loginPage.submitButton().click();
				
	}
	
	@After
	public void windowQuit() {
		driver.quit();
		
	}
	
}
