package TestSuite;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository.Login;
import ObjectRepository.admin;
import utility.CommonMethods;
import utility.ExcelReader;
import utility.TestData;

public class smokeTest extends CommonMethods {
	WebDriver driver;
	
	
  @BeforeTest
  public void launchingBrowser() throws FileNotFoundException, IOException {
	  ExcelReader exc = new ExcelReader();
	  exc.columnDictionary();
	  CommonMethods.testInputs("Internet Explorer");
	  TestData data = new TestData();
	  CommonMethods.readExcelData(data);
	  
	 System.setProperty("webdriver.ie.driver", "C:\\Users\\tanu.a.arora\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	 driver = new InternetExplorerDriver();
	 driver.get("https://www.qc.engagementsurveycenter.com/dsi0032/login");
  }
  
  @Test
  public void loginApp() throws InterruptedException {
	  Login lg = new Login(driver);
	  lg.enterUsername(appUser);
	  lg.enterPassword(appPassword);
	  lg.clickLogin();
	  Thread.sleep(5000);
	  driver .findElement(By.linkText("Admin")).click();
  }
  
  @Test
  public void addingNewUser() {
	  HomePage hp = new HomePage(driver);
	  hp.clickAdmin();
	  admin am = new admin(driver);
	  am.EnterFirstName("Tester");
  }
}
