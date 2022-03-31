package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects{

	@FindBy(xpath ="//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[4]/a")          //a[contains(@href,'profile')]/child::*
	public static WebElement myprofile;
	
	@FindBy(name ="phone")
	public static WebElement phoneNumber;
	
	@FindBy(name = "city")
	public static WebElement city;
	
	@FindBy(xpath = "//button[contains(text(),'Update Profile')]")
	public static WebElement submit;
	

	/*
	 * public static WebElement myprofile(WebDriver driver) { return
	 * driver.findElement(By.xpath("//a[contains(@href,'profile')]/child::*")); }
	 * 
	 * public static WebElement phoneNumber(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[text() ='Update Profile']")); }
	 */

}


/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\sathy\\OneDrive\\Desktop\\Kavitha\\Selenium\\WebDrivers\\Chrome_Driver\\chromedriver.exe"
 * );
 * 
 * WebDriver driver = new ChromeDriver();
 * driver.get("https://www.phptravels.net/login"); //user@phptravels.com,
 * demouser
 * 
 * WebElement userName = driver.findElement(By.name("email"));
 * userName.sendKeys("user@phptravels.com");
 * 
 * WebElement passWord = driver.findElement(By.name("password"));
 * passWord.sendKeys("demouser");
 * 
 * WebElement loginButton = driver.findElement(By.xpath("//div[3]/button"));
 * loginButton.click();
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//div[3]/ul/li[1]/a")).click();
 * 
 * Thread.sleep(2000); WebElement myprofile =
 * driver.findElement(By.xpath("//div[3]/ul/li[4]/a")); myprofile.click();
 * 
 * 
 * Thread.sleep(2000); WebElement phoneNumber =
 * driver.findElement(By.name("phone")); phoneNumber.sendKeys("1234567890");
 * 
 * WebElement city = driver.findElement(By.name("city"));
 * city.sendKeys("London");
 * 
 * WebElement updateButton = driver.findElement(By.linkText("Update Profile"));
 * updateButton.click();
 * 
 * 
 * driver.quit();
 */