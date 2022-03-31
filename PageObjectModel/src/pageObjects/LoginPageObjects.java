package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	//UserName, Password, Submit btn
	
	@FindBy(how=How.NAME,using ="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath ="//span[@class='ladda-spinner']/preceding-sibling::*")
	public static WebElement submit;
	

	
}

/*
 * public static WebElement userName(WebDriver driver) { return
 * driver.findElement(By.name("email")); }
 * 
 * public static WebElement password(WebDriver driver) { return
 * driver.findElement(By.name("password")); }
 * 
 * public static WebElement loginbutton(WebDriver driver) { return
 * driver.findElement(By.xpath(
 * "//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button")); }
 */