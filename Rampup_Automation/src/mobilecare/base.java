package mobilecare;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	public static void ab(ChromeDriver driver, String path) throws IOException
	{
	//	TakesScreenshot ts = (TakesScreenshot) driver;
	//	File src = ts.getScreenshotAs(OutputType.FILE);
	//	File dec = new File(path);
	//	FileUtils
		
		File f = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
		
	}

}
