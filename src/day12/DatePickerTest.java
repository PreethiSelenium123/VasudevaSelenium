package day12;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerTest {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		//String date="15/march/2018";
		String [] dateSpilit=date.split("/");
		String day=dateSpilit[0];
		String month=dateSpilit[1];
		String year=dateSpilit[2];
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		//year selection
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calYear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			 calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//month selection
		
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//day selection
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
		//col
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size(); j++) 
			{
				String calDay=col.get(j).getText();
				if (calDay.equals(day))
				{
					col.get(j).click();
					break;
				}
			}
			
		}
		
		
	
	}

}
