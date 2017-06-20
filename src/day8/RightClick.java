package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		Actions right=new Actions(driver);
		//right.contextClick(gmail).sendKeys("T").build().perform();
		
		right.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
