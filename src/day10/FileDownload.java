package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Seleniumhq.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\dnl.exe");
		/*Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		rt.keyPress(KeyEvent.VK_ENTER);*/
		
	}

}
