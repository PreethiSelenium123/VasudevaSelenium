package day15;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmpTest extends ORHMMaster
{
@Test
public static void addEmp()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Vasudeva");
	driver.findElement(By.id("lastName")).sendKeys("yadav");
	
	
	driver.findElement(By.id("btnSave")).click();
}
}
