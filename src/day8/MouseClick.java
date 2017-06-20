package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
	

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/English/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("Manage your booking-link-label")).click();
		WebElement manage=driver.findElement(By.xpath(".//*[@id='trips']/a/span[1]"));
		WebElement booking=driver.findElement(By.xpath(".//*[@id='Manage your booking-link-label']"));
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(manage).build().perform();
		mouse.moveToElement(booking).click().build().perform();
	}

}
