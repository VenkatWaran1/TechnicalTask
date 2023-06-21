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
		
		driver.get("https://codoid.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Screenshot\\ScreenShot1.jpg");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println(title);
		driver.close();
		
	}

}
