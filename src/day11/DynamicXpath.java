package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args)
	{
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Selenium");
		List<WebElement> links=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_149322')]/span"));
		System.out.println(links.size());
		links.get(1).click();
		

		

	}

}
