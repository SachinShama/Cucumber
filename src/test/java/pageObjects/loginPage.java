package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	
	public loginPage( WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	 @FindBy(name="username")
	 WebElement username;
	 
	 @FindBy(name="password")
	 WebElement password;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement submit;
	 
public void userMethod(String usrname) {
	username.sendKeys(usrname);
}

public void pwdMethod(String pword) {
	password.sendKeys(pword);
}

public void submit() {
	 submit.click();
}


}
