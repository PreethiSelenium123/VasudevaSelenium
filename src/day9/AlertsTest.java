package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();

	}

}
