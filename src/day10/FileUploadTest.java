package day10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Vasudeva");
		driver.findElement(By.id("lastName")).sendKeys("yadav");
		//driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		driver.findElement(By.id("photofile")).click();
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\lakshmi.exe");
		driver.findElement(By.id("btnSave")).click();
	}

}
