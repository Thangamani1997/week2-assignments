package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//TO LOAD THE URL
		driver.get("https://en-gb.facebook.com/");
		
		//TO CLICK CREATE NEW BUTTON
		driver.findElement(By.linkText("Create new account")).click();
		
		//TO PRINT 1st NAME
		driver.findElement(By.name("firstname")).sendKeys("Thangamani");
		
		//TO PRINT SUR NAME
		driver.findElement(By.name("lastname")).sendKeys("Murugesan");
		
		//TO PRINT MAIL ID OR MOBILE NO
		driver.findElement(By.name("reg_email__")).sendKeys("thangamanimurugesan1008@gmail.com");
		
		//TO RE-PRINT MAIL ID OR MOBILE NO
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thangamanimurugesan1008@gmail.com");
				
		//TO PRINT NEW PASSWORD 
		driver.findElement(By.id("password_step_input")).sendKeys("Prithivi@2020");
		
		//STORE SYNTAX IN WEB ELEMENT
		WebElement dd = driver.findElement(By.id("day"));
		
		//TO CREATE OBJECT SELECT CLASS (day)
		Select opt =new Select(dd);
		opt.selectByVisibleText("8");
		
		//TO CREATE OBJECT SELECT CLASS (month)
		WebElement mon = driver.findElement(By.id("month"));
		Select op =new Select(mon);
		op.selectByVisibleText("Feb");
		
		//TO CREATE OBJECT SELECT CLASS (year)
		WebElement yr = driver.findElement(By.id("year"));
		Select optn =new Select(yr);
		optn.selectByVisibleText("1997");
		
		//TO SELECT GENDER
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
	}

}
