package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {

	@Test
	public void updateProfile() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(5000);

		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		
		Thread.sleep(5000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		UpdateProfileObjects.myprofile.click();
		
		
		UpdateProfileObjects.phoneNumber.sendKeys("3433333");
		UpdateProfileObjects.city.sendKeys("Toronto Raptors");
		UpdateProfileObjects.submit.click();

	}
}

/*
 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
 * LoginPageObjects.password(driver).sendKeys("demouser");
 * LoginPageObjects.loginbutton(driver).click();
 */
/*
 * driver.manage().window().maximize(); Thread.sleep(4000);
 * UpdateProfileObjects.myprofile(driver).click();
 * UpdateProfileObjects.phoneNumber(driver).sendKeys("0967676766");
 * UpdateProfileObjects.city(driver).sendKeys("Agni Landing");
 * Thread.sleep(4000);
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,200)", "");
 * 
 * UpdateProfileObjects.submit(driver).click();
 */


/*
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); WebElement
 * myprofile =
 * driver.findElement(By.xpath("//a[contains(@href,'profile')]/child::*"));
 * myprofile.click();
 * 
 * driver.navigate().refresh();
 * 
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); WebElement
 * phoneNumber1 = driver.findElement(By.name("phone"));
 * phoneNumber1.sendKeys("4545");
 * 
 * 
 * WebElement city1 = driver.findElement(By.name("city"));
 * city1.sendKeys("pavi flying" +Keys.ENTER);
 */

/*
 * WebElement update =
 * driver.findElement(By.xpath("//*[text() ='Update Profile']"));
 * update.click();
 */


/*
 * WebElement userName = driver.findElement(By.name("email"));
 * userName.sendKeys("user@phptravels.com");
 * 
 * WebElement passWord = driver.findElement(By.name("password"));
 * passWord.sendKeys("demouser");
 * 
 * WebElement loginButton = driver.findElement(By.xpath("//div[3]/button"));
 * loginButton.click();
 * 
 * Dimension dimension = new Dimension(1920, 1080);
 * driver.manage().window().setSize(dimension);
 */