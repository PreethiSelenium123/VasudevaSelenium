package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRMFunTest 
{
	public static FirefoxDriver driver;
	public static String res;
	
public  String appLaunch()
{
	
	 driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
	{
		res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
}

public String appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	if (driver.findElement(By.id("welcome")).isDisplayed()) 
	{
	 res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
}

public String addEmp(String fname,String lname)
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys(fname);
	driver.findElement(By.id("lastName")).sendKeys(lname);
	driver.findElement(By.id("btnSave")).click();
	if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
	{
		res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
	}

}
