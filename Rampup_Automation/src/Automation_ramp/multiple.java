package Automation_ramp;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class multiple
{
 // public  ChromeDriver driver;
	
//	@BeforeTest
	public static void main(String[] args) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","D:\\newchrome\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	    Thread.sleep(3000);
	    driver.findElement(By.name("Submit")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.className("ac_input")).sendKeys("John Smith");
		Thread.sleep(1000);
	WebElement test=	driver.findElement(By.id("assignleave_txtLeaveType"));
		Select select = new Select(test);
		select.selectByValue("9");
		Thread.sleep(3000);
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		
		WebElement month= driver.findElement(By.className("ui-datepicker-month"));
		
		Select select1 = new Select(month);
		select1.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select select2 = new Select(year);
		
		select2.selectByValue("1997");
		
		Thread.sleep(3000);
		
		String date = "7";
		
	    List<WebElement> alldates1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele1:alldates1)
		{
			String dt =ele1.getText();
			if(dt.equals(date))
			{
				ele1.click();
			}
			//	try
			//	{
					
			//	alldates1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		//		dt =ele1.getText();
			//	if(dt.equals(date))
			//	{
				//	ele1.click();
			//	}
			//	ele1.click();
			//	}
			//	catch(StaleElementReferenceException e)  // TODO: handle exception
			//	{
				
				//	alldates1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				//	dt =ele1.getText();
				//	if(dt.equals(date))
				//	{
					//	ele1.click();
				//	}
				//	ele1.click(); 
				}
	            try
					{
	            	for(WebElement ele1:alldates1)
	            	{
					alldates1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				 String  dt =ele1.getText();
					if(dt.equals(date))
					{
						ele1.click();
					}
					ele1.click();
					}
					}
					catch(StaleElementReferenceException e)  // TODO: handle exception
					{
						for(WebElement ele1:alldates1) {
					alldates1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
					String	dt =ele1.getText();
						if(dt.equals(date))
						{
						ele1.click();
						}
						ele1.click(); 
					}
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement test1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"assignBtn\"]")));
			test1.click();
					}
			
		catch(ElementNotInteractableException e1)
	            {
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement test1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"assignBtn\"]")));
			test1.click();
	            }
			
			
		}
	           
	            
		
		
		
	
	            
	}
	
