package mobilecare;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\newchrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.nutraj.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		
		//Alert alert = driver.switchTo().alert();
	//	alert.dismiss();
				
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("close")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='li1']/a")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.id("input-email")).sendKeys("mrajput988@gmail.com);
		
		driver.findElement(By.className("create-account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-registration-email")).sendKeys("mrajput988@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-registration-telephone")).sendKeys("8802823334");
		Thread.sleep(2000);
		driver.findElement(By.id("input-registration-password")).sendKeys("Manoj@1234");
		Thread.sleep(3000);
		WebElement reg= driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[2]/div[3]/form/div[2]/div[1]/input"));
		
		WebDriverWait ws = new WebDriverWait(driver, 5);
		
		ws.until(ExpectedConditions.visibilityOf(reg));
		reg.click();
		
		Thread.sleep(6000);
		
       Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[2]/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='li1']/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("mrajput988@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("Manoj@1234");
		
		
		
		
		
		//*[@id="content"]/div/div/div[1]/div[2]/div[3]/form/div[2]/div[1]/input
		
		
		

	}

}
