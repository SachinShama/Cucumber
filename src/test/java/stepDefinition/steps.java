package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.dashboard;
import pageObjects.loginPage;

public class steps {
	public WebDriver driver;
	public loginPage lp;
	public dashboard db;
	
	@Given("Chrome broswer is launched")
	public void chrome_broswer_is_launched() {
	    System.setProperty("webdriver.chrome.driver","/Users/tarun/Downloads/chromedriver_mac64 (2)/chromedriver");
	    driver=new ChromeDriver();
	    lp=new loginPage(driver);
	    db=new dashboard(driver);
	}
	
	@And("User navigates to the orangeHRM URL {string}")
	public void user_opens_the_orange_hrm_url(String URL) throws InterruptedException {
	    driver.get(URL);
	    Thread.sleep(3000);
	}

	@Given("Provide the username as {string} and password as {string}")
	public void provide_the_username_as_and_password_as(String uname, String pwd) {
	    lp.userMethod(uname);
	    lp.pwdMethod(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    lp.submit();
	}

	@Then("User page title should be {string}")
	public void user_page_title_should_be(String title) {
	    if(driver.getTitle().equals(title)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}
	
	@Given("user clicks on Dashboard Options")
	public void user_clicks_on_Dashboard_Options() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    db.dashOptions();
	    Thread.sleep(5000);
	}

	@Then("Employee Distribution by location should be fetched")
	public void employee_Distribution_by_location_should_be_fetched() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
