package day17;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		     WebElement element= driver.findElement(By.id("month"));
		       
		       Select elements=new Select(element);
		       elements.selectByIndex(5);
		       Thread.sleep(5000);
		      //elements.deselectByIndex(5);//ou may only deselect options of a multi-select
		       List <WebElement> month =elements.getOptions();
		      System.out.println("toatal element:"+month.size()); 
		      
		      WebElement ele=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		      Select select=new Select(ele);
		      select.selectByValue("4");
		      List<WebElement> day=select.getOptions();
		      System.out.println("total day element:"+day.size());
		      
		      for(int i=0;i<day.size();i++){
		       System.out.println(day.get(i));
		      }
		      
		      
		      WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		      Select sel=new Select(year);
		      sel.selectByValue("2009");


	}

}
