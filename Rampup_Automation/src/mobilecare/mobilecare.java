package mobilecare;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mobilecare extends base 
{

	public ChromeDriver driver;
	public ChromeOptions options= new ChromeOptions();  // For handled permission pop-up.
	public WebDriverWait ws;
	@BeforeTest
	public void click()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\newchrome\\chromedriver.exe");
		
		options.addArguments("--disable-notifications");   // For handled permission pop-up.
		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://10.32.100.92:8445/commonprov/Webconsole.action?isSessionExpired=1");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority =0)
	public void domain() throws InterruptedException
	{
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("details-button")).click();
		
		driver.findElement(By.id("proceed-link")).click();
	}
	@Test(priority=1)
	public void register() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"domainName\"]")).sendKeys("brooklyn.com");
		Thread.sleep(2000);
		driver.findElement(By.id("registerDomain")).click();
		
	
	
	}
    
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		ChromeOptions options= new ChromeOptions();
		Thread.sleep(3000);
		driver.findElement(By.id("loginUserName")).sendKeys("mg");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("1111");
		
		Thread.sleep(3000);
		driver.findElement(By.id("loginUser")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("dismiss")).click();
		Thread.sleep(5000);
		
	// Alert alert= driver.switchTo().alert();
	// System.out.println(alert);
		
	//	driver.switchTo().alert().accept();
		
		
	 
	}
	@Test(priority=3)
	public void contacts() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement contects= driver.findElement(By.id("webConsoleContact"));
		contects.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='headsearch' and  @id='headSearch']")).sendKeys("manoj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='headSearchButton' and  @id='headSearchButton']")).click();
		
		Thread.sleep(2000);
		
	WebElement mouse=	driver.findElement(By.xpath("//*[@id='userContactId_2']"));
		Thread.sleep(2000);
		
		mouse.click();
		
		//Actions ac = new Actions(driver);
		//ac.moveToElement(mouse).click().perform();
		
		try 
		{
		
			mouse=	driver.findElement(By.xpath("//*[@id='userContactId_2']"));
            Thread.sleep(2000);
			
			mouse.click();
		}
		
		catch (StaleElementReferenceException e) 
		{
			driver.findElement(By.xpath("//*[@id='userContactId_2']"));
			Thread.sleep(2000);
			
			mouse.click();
			
		}
		Thread.sleep(3000);
		driver.findElement(By.id("composeMessageFromContact")).click();
		Thread.sleep(5000);
//	WebElement mes= driver.findElement(By.xpath("//textarea[@id='searchcontactbox' and @tabindex='1']"));
	//	Thread.sleep(3000);
	//	mes.sendKeys("manoj singh");
		ws = new WebDriverWait(driver, 10);
		WebElement mes = ws.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='searchcontactbox' and @tabindex='1']")));
		mes.sendKeys("manoj singh");
		
		Thread.sleep(3000);
		driver.findElement(By.id("sendMessageThread")).click();
		Thread.sleep(3000);
		
		base.ab(driver,".\\screenshot\\mob2.png");
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void temp() throws InterruptedException
	{
		//driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement template = driver.findElement(By.xpath("//*[@class='defaultTemplatesSelect'and @id='defaultTemplatesSelect']"));
//	boolean s=	template.isDisplayed();
//	if (s==true)
	//	{
	//	Thread.sleep(3000);
	//	template.click();
    // 	Thread.sleep(3000);
		//template.click();
	//	}
	//else
	//	{
		//	System.out.println("not selected");
	//	}
	//	Thread.sleep(3000);
		
		Select s = new Select(template);
		s.selectByValue("Busy right now, talk to you later");
		
		
		
	}
	@Test(priority=5)
	public void patient() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("mypatientnav")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("headSearch")).sendKeys("deepansh");
		
		Thread.sleep(2000);
		driver.findElement(By.id("headSearchButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("SideMenu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='radiologynav']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='view_radioDetail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='attachchild_0']")).click();
		Thread.sleep(8000);
		WebElement com= driver.findElement(By.id("token-input-contactsList"));
		ws.until(ExpectedConditions.elementToBeClickable(com));
		com.click();
		Thread.sleep(2000);
		com.sendKeys("Manoj");
		Thread.sleep(2000);
		
		WebElement ch = driver.findElement(By.xpath("/html/body/div[13]/ul/li[1]/a/div"));
		
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ch.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchcontactbox']")).sendKeys("Radiology");
		Thread.sleep(2000);
		driver.findElement(By.id("sendmessage")).click();
		Thread.sleep(5000);
		
	}
	@Test(priority=6)
	public void alerts() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement alert=	driver.findElement(By.id("myalertsnav"));
	ws.until(ExpectedConditions.elementToBeClickable(alert));
	Thread.sleep(5000);
	alert.click();
	try {
		alert=	driver.findElement(By.id("myalertsnav"));
		ws.until(ExpectedConditions.elementToBeClickable(alert));
		Thread.sleep(5000);
		alert.click();
	}
	catch (ElementClickInterceptedException e) 
	{
		alert=	driver.findElement(By.id("myalertsnav"));
		ws.until(ExpectedConditions.elementToBeClickable(alert));
		Thread.sleep(5000);
		alert.click();
	}
	
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='myalertattachmentDiv_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='breadcrumb' and @ng-show='backdisplay == 1']")).click();
		
		
	}
	@Test(priority=7)
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id("loggedUserInfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='logout']/a")).click();
		
		
		
	}
	
	
	
	}

	
	

