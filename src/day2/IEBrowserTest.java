package day2;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class IEBrowserTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\vasu\\Downloads\\IEDriverServer.exe");
InternetExplorerDriver driver=new InternetExplorerDriver();
driver.get("http://facebook.com");

	}

}
