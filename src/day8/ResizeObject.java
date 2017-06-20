package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeObject
{
public static void main(String[] args) throws InterruptedException 
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/resizable/");
	driver.manage().window().maximize();
	List<WebElement> frame=driver.findElements(By.tagName("iframe"));
	System.out.println(frame.size());
	driver.switchTo().frame(0);
	WebElement resize=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	Actions rs=new Actions(driver);
	Thread.sleep(3000);
	rs.clickAndHold(resize).moveByOffset(80, 90).build().perform();
	
}
}
