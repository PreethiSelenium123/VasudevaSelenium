package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDwonTest1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			//System.out.println(dropList.get(i).getText());
			if (dropList.get(i).getText().equals("Music")) 
			{
				dropList.get(i).click();
			}
		}

	}

}
