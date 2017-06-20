package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//.//*[@id='cee_closeBtn']/img
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		Thread.sleep(8000);
		String homePage=driver.getWindowHandle();
		System.out.println(homePage);
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while (it.hasNext())
		{
			String currentwindow=it.next().toString();
			
			System.out.println(currentwindow);
			if (!homePage.equals(currentwindow))
			{
				driver.switchTo().window(currentwindow);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
			
		}
	}

}
