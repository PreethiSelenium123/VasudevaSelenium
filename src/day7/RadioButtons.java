package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_g")).click();

	}

}
