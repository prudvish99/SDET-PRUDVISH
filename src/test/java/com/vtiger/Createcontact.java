package com.vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericrepository.ExcelUtility;
import com.vtiger.genericrepository.FileUtility;
import com.vtiger.genericrepository.JavaUtility;
import com.vtiger.genericrepository.WebDriverUtility;

public class Createcontact {
	
	JavaUtility jv = new JavaUtility();
	FileUtility fu=  new FileUtility();
	ExcelUtility eu= new ExcelUtility();
	WebDriverUtility wdu= new WebDriverUtility();
	
	@Test
	public void createOrg() throws IOException, InterruptedException 
	{
		
		
	


		//Read data from property file
		String UN=fu.readDatafrompropfile("username");
		String PWD=fu.readDatafrompropfile("password");
		String URL=fu.readDatafrompropfile("url");

		WebDriver d = new ChromeDriver();
		wdu.maximizewindow(d);
		d.get(URL);
		wdu.implicitwait(d);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
		d.findElement(By.id("submitButton")).click();
		
		
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		d.findElement(By.xpath("//img[contains(@title,'Create Contact')]")).click();
		WebElement we=d.findElement(By.xpath("//select[@name='salutationtype']"));
		wdu.selectdropdownbyvalue(we,"Mr.");
		//Select s =new Select(we);
		//s.selectByValue("Mr.");
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jagadeesh");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lavu");
		d.findElement(By.xpath("//input[@id='phone']")).sendKeys("8977688488");
		d.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		d.close();

}
}