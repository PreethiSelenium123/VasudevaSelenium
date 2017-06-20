package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://Google.com");
driver.manage().window().maximize();
driver.findElement(By.className("gb_P")).click();

if (driver.findElement(By.id("next")).isDisplayed()) 
{
	System.out.println("Pass");
}else
{
	System.out.println("Fail");
}


	}

}
