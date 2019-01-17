package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class admin {
	WebDriver driver;
	public admin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "accessMethod")
	WebElement UserType;
	
	@FindBy(xpath = "//button[@value ='add'][1]")
	WebElement GoUserBtn;
	
	@FindBy(id = "firstName")
	WebElement FirstName;
	
	@FindBy(id = "lastName")
	WebElement LastName;
	
	@FindBy(id = "eid")
	WebElement ID;
	
	@FindBy(id = "password")
	WebElement NewPassword;
	
	@FindBy(id ="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id = "accessLevel")
	WebElement AccessLevel;
	
	public void SelectUser(String Usertype) {
		Select st = new Select(UserType);
		st.selectByVisibleText(Usertype);
	}
	public void ClickGoUser() {
		GoUserBtn.click();
	}
	public void EnterFirstName(String NewUser_FirstName) {
		FirstName.sendKeys(NewUser_FirstName);
	}
	public void EnterLastName(String NewUser_LastName) {
		LastName.sendKeys(NewUser_LastName);
	}
	public void EnterID(String ID) {
		this.ID.sendKeys(ID);
	}
	public void EnterNewPassword(String newPassword) {
		NewPassword.sendKeys(newPassword);
	}
	public void EnterConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}
	public void selectAccessLevel(String accessLevel) {
		Select st = new Select(AccessLevel);
		st.selectByVisibleText(accessLevel);
	}
	

}
