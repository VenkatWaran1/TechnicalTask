package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://codoid.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement ourProd = driver.findElement(By.xpath("//a[text()='Our Products'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(ourProd).build().perform();
		
		Thread.sleep(2000);
		
		WebElement visGrid = driver.findElement(By.xpath("//a[text()='VisGrid']"));
		action.moveToElement(visGrid).click().perform();
		
		Thread.sleep(2000);
		
		WebElement relNotes = driver.findElement(By.xpath("//a[text()='release notes']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", relNotes);
		driver.close();
		
	}

}
