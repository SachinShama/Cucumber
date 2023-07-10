package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	WebDriver ldriver;
	
	public dashboard(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
@FindBy(className=("oxd-text oxd-text--span oxd-main-menu-item--name"))
List<WebElement> dashboard;

public void dashOptions() {
	for(WebElement dash:dashboard) {
	String menuText=dash.getText();
	if (menuText.equals("Dashboard")) {
		dash.click();
		break;
	}
	}
}
}
