package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void Validate_Login_Page() {
		
		driver.get("https://www.browserstack.com/guide/devops-selenium");
		
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), " Integrating Selenium into DevOps: Automating Testing in CI/CD Pipelines ");
		
	}
	
}
