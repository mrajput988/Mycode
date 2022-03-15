package Pkg2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\newchrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);                          // thread is use for wait in selenium it is hard coded it wait for next statement.  
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // implicityliywait is use for next all statement below from it.
		
		List<WebElement> ls= driver.findElements(By.tagName("input"));
		System.out.println(ls.size());
			
		Actions ac=new Actions(driver);           // action class is used for modify keys in selenium.                    
			
		WebElement login=driver.findElement(By.id("loginbutton"));
		
		 WebDriverWait ws = new WebDriverWait(driver,5);                 // expilicitwait is use for particuler codition.
		 ws.until(ExpectedConditions.elementToBeClickable(login));       //expilicitwait is use for particuler codition.
		
		ac.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).perform();
			
		 System.out.println("page url "+driver.getCurrentUrl());
		 
		 String current_window=driver.getWindowHandle();    //getwindowhandele is used for handle curreent window. 
		  Set<String> all_window=driver.getWindowHandles();  //getwindowhandeles is used for multiple windows.
		  
		  System.out.println("all windows "+all_window.size());
		  
		  for(String s:all_window)
		  {
			  driver.switchTo().window(s);
			 
		  }
		  System.out.println("now url is "+driver.getCurrentUrl());
		  driver.switchTo().window(current_window);
		  
		  System.out.println("at last "+driver.getCurrentUrl());

	}

}
