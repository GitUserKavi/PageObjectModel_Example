package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCases {

	//Username, Password, Submit Button

	@Test
	public void loginTestcase() throws InterruptedException {

		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login"); //user@phptravels.com, demouser
		Thread.sleep(3000);

		PageFactory.initElements(driver, LoginPageObjects.class);

		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();



	}
}

/*
 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
 * LoginPageObjects.password(driver).sendKeys("demouser");
 * LoginPageObjects.loginbutton(driver).click();
 */




/*
 * LoginPageObjects loginPageObjects = new LoginPageObjects();
 * loginPageObjects.userName(driver).sendKeys("user@phptravels.com");
 */



/*
 * WebElement userName = driver.findElement(By.name("email"));
 * userName.sendKeys("user@phptravels.com");
 * 
 * WebElement passWord = driver.findElement(By.name("password"));
 * passWord.sendKeys("demouser");
 * 
 * WebElement loginButton = driver.findElement(By.xpath(
 * "//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
 * loginButton.click();
 * 
 * driver.quit();
 */