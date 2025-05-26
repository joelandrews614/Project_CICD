package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--no-sandbox");
		 options.addArguments("--disable-dev-shm-usage");
		 options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver != null)
			driver.quit();
	}
	
}
