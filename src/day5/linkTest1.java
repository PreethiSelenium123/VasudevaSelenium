package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkTest1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		//WebElement is Used to Stored Captured information from web page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
			//getText is used to get the text present on the element
			
			if (!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
		}
	}

}
