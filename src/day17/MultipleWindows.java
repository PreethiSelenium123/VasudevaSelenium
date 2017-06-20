package day17;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		String homePage=driver.getWindowHandle();
		
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while (it.hasNext()) 
		{
			String currentWindow=it.next().toString();
			
			if (!homePage.equals(currentWindow)) 
			{
				driver.switchTo().window(currentWindow);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}
		
	}

}
