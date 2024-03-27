package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
public static void main (String []args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.gmail.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("ashvinisusar@gmail.com");
	driver.findElement(By.className("CwaK9")).click();
	String at=driver.getTitle();
	String et ="gmail";
	driver.close();
	if(at.equalsIgnoreCase(et))
	{
		 System.out.println("login success");
	}
	else 
	{
		System.out.println("test Failure");
	}
}
}
