package Automation_ramp;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class liberian_tech
{
	
	public ChromeDriver driver;

	@BeforeTest
	public void lib1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\newchrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
	
	}
	@Test(priority=1)
     public	void lib2() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement one= driver.findElement(By.name("q"));
		Thread.sleep(2000);
		one.sendKeys("liberian technology");
		
		// For taking screenshot 
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshot\\test1.png");
		FileUtils.copyFile(src, trg);
		
		
	}
	
	@Test(priority=2)
	public void test3() throws InterruptedException
	{
		
		WebElement test =	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		Thread.sleep(3000);
		
		test.click();
		
		//Thread.sleep(3000);
		
		
		
		
		//driver.findElement(By.xpath("//a[@class='ab_button']")).click();
		
	}
	@Test(priority=3)
	public void test4() throws IOException, InterruptedException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshot\\test4.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
	}
	@Test(priority=4)
	public void test5() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ms=  driver.findElement(By.className("ab_button"));
		Actions ac = new Actions(driver);
		
	  ac.keyDown(Keys.CONTROL).click(ms).keyUp(Keys.CONTROL).perform();
	  
	 String newwin= driver.getWindowHandle();
		
	 Set<String> all_window = driver.getWindowHandles();
	 System.out.println("Total window"+all_window.size());
	 
	 for(String a: all_window)
	 {
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.switchTo().window(a);
		 Thread.sleep(2000);
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)"); // It is used for scroll down
			
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");  // it is used for scroll up
	 }
	 Thread.sleep(3000);
		driver.switchTo().window(newwin);
		
		//Thread.sleep(2000);
		//JavascriptExecutor js =(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)");
		
		
	}
	@Test(priority=5, enabled = false)
	public void test6() throws InterruptedException 
	{
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
		
	
		
	}
	



