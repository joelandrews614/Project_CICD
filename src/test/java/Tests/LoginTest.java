package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void Validate_DevOps_Selenium_Design() {
				
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Integrating Selenium into DevOps: Automating Testing in CI/CD Pipelines");
		
	}
	
	@Test
	public void Validate_Sign_In() {
		
		driver.findElement(By.cssSelector("[title='Sign in']")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/sign_in");
		
	}
	
}
