package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage
{
 public WebDriver idriver;
 
 public LoginPage(WebDriver rdriver)
 {
	 idriver = rdriver;
	 PageFactory.initElements(rdriver, this);	 
 }
 
 @FindBy(id="txtUsername")
 @CacheLookup
 WebElement username;
 
 @FindBy(xpath="//input[@name='txtPassword']")
 @CacheLookup
 WebElement password;
 
 @FindBy(name="Submit")
 @CacheLookup
 WebElement submit;
 
 public void setusername(String uname)
 {
	 username.sendKeys("Admin");
	 
 }
 
 public void setPassword(String pwd)
 {
	 password.sendKeys("admin123");
 }
 
 public void clicklogin()
 {
	 submit.click();
 }
	
	
}
