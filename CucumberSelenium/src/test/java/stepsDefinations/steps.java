package stepsDefinations;

import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class steps 
{
	public WebDriver driver;
	public LoginPage Lp;

	@Given("User Launch chrome browser")
	public void userlaunch()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Lp = new LoginPage(driver);
		
		
	}
	
	@When("User opens URL {string}")
    public void User_open_URL(String url) throws InterruptedException
    {
	 driver.get(url);
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
		
    }
	
	@When("User enters Username as {string}")
	public void User_enters_Username_as(String uname1) throws InterruptedException
	{
		Thread.sleep(2000);
		Lp.setusername(uname1);
	}
	@When("User enters Password as {string}")
	public void User_enters_Password_as(String pwd1) throws InterruptedException
	{
		Thread.sleep(2000);
		Lp.setPassword(pwd1);
	}
	@When("Click on button")
	public void Click_on_button() throws InterruptedException
	{
		Thread.sleep(3000);
		Lp.clicklogin();
	}
}
