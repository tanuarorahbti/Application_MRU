package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public  static void main(String[] args) {
		login();
		
	}
	public static void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAPPY\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	WebElement loginbtn = driver.findElement(By.xpath("//input[@value = 'Log In']"));
	loginbtn.click();
	System.out.println("Tanu");
	
	}
	

}
