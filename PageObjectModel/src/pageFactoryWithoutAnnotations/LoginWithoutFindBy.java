package pageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;

	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin");
		btnLogin.click();
	
	
	}
	
	
	

}
