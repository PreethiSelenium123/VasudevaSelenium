package day11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
System.out.println(list.size());
for (int i = 0; i < list.size(); i++) 
{
	if (list.get(i).getText().equals("Hyderabad"))
	{
		list.get(i).click();
		break;
	}
}
	}

}
