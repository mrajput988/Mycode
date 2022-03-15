package Pkg2;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Total_input {

	public static void main(String[] args)
	{
	
		
		 System.setProperty("webdriver.chrome.driver","D:\\newchrome\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 
	       List<WebElement> ls= driver.findElements(By.tagName("input"));
	      
	     System.out.println(ls.size());
		 Scanner s= new Scanner(System.in);
		 String s1;
		 for(WebElement e:ls)
		 {
			 
			 s1=s.next();
			 e.sendKeys(s1);
		 }
	     
	}

}
