package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxBrowserTest {

	public static void main(String[] args) throws Exception
	{
		//Launching Firefox Browser
		FirefoxDriver driver=new FirefoxDriver();
		//Navigating to a url
		driver.get("https://m.ladbrokes.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//*[@id="intro-popup"]/div/div[3]/div/div
		//driver.findElement(By.className("//*[@id="intro-popup"]/div/div[3]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='header']/div/div[3]/div[4]/div/div[1]/a/div")).click();
		//driver.findElement(By.id("login_username")).sendKeys(arg0);

	}

}
