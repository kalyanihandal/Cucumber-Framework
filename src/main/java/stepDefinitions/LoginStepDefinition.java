package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
    public void userIsAlreadyOnLoginPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
    }
	
   @When("^title of login page is Free CRM$")
   public void titleOfLoginPageIsFreeCRM() {
   String title=driver.getTitle();
   System.out.println(title);
   Assert.assertEquals("Free CRM software for any Business", title);
	}
	
	@Then("^user clicks on Login profile$")
	public void userClicksOnLoginProfile() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void userEntersUsernameAndPassword(String username, String password){
	  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@Then("^user clicks on Login button$")
	public void userClicksOnLoginButton(){
		   driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("^user is on home page$")
	public void userIsOnHomePage(){
		  String title=driver.getTitle();
		  System.out.println(title);
		  Assert.assertEquals("CRM", title);
	}
}