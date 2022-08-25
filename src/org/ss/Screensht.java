package org.ss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("wedriver.chrome.driver", "G:\\ScreenShot\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot takss = (TakesScreenshot) driver;
		
		File screenshotAs = takss.getScreenshotAs(OutputType.FILE);  
		
		System.out.println(screenshotAs);
		
		File loc = new File("G:\\ScreenShot\\ss.png");
		
		FileUtils.copyFile(screenshotAs,loc);
		
		
		
		
		
		
		
		
		
	}

}
