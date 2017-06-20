package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		//p[@class='tagline']
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Gmail.com");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(text);

	}

}
