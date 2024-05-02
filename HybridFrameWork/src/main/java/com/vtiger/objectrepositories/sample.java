package com.vtiger.objectrepositories;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:8888/");
		Thread.sleep(5000);
		
		//login to app with valid credentials
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		Thread.sleep(5000);
		
		//click on ORG module
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Thread.sleep(5000);
		
		//click on ORG lookupimage
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Thread.sleep(5000);
		
		//random class
		Random ran = new Random();
		int r = ran.nextInt(100);
		
		
		//create ORG with manual fields - UST GLOBAL
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("UST GLOBAL1"+r);
		Thread.sleep(5000);
		
		//save it
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(5000);
			
		//verification
		String orgHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		//System.out.println(orgHeader);
		Thread.sleep(5000);
		if(orgHeader.contains("UST GLOBAL")) {
			System.out.println("org is created and TC is pass");
		}
		else{
			System.out.println("org is not created and TC is fail");
		}
		
		Thread.sleep(5000);
		//log out of app
		
		WebElement admImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a =new Actions(driver);
		a.moveToElement(admImg).perform();
		
		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();
		
		
		
	}		
	}


