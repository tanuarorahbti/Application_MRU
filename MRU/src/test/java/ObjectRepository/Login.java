package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {
  
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//input[@name ='username']")
	WebElement loginUser;
	
	@FindBy(xpath = "//input[@name ='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@value = 'Sign In']")
	WebElement loginbtn;
	
	public void enterUsername(String user) {
		loginUser.sendKeys(user);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginbtn.click();
	}
	
	
  public void f() {
  }
}
