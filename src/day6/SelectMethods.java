package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		//sl.selectByIndex(6);
		//sl.selectByValue("search-alias=furniture");
		//sl.selectByVisibleText("Baby");
		List<WebElement> droplist=sl.getOptions();
		System.out.println(droplist.size());
		for (int i = 0; i < droplist.size(); i++) 
		{
			System.out.println(droplist.get(i).getText());
		}
		
	}

}
