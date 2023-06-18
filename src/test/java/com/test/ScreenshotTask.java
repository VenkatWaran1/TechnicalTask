package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTask {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://codoid.com/");
		
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Screenshot\\ScreenShot1.jpg");
		
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
	}

}
