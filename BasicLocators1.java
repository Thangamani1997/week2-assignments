package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get("http://leaftaps.com/opentaps/.");
		
		//TO ENTER USER ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//TO ENTER PASSWORD
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//TO PRESS LOGIN BUTTON
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//TO PRESS CRMSFA TEXT
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//TO PRESS LEAD TAB
		driver.findElement(By.linkText("Leads")).click();
				
		//TO PRESS CREATE LEAD 
		driver.findElement(By.linkText("Create Lead")).click();
						
		//TO ENTER FIRST NAME 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thangamani");
							
		//TO ENTER LAST NAME 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugesan");
				
		//TO ENTER COMPANY NAME
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
		//TO ENTER TITLE 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing Engineer");
							
		//TO ENTER TITLE 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9944263157");
									
		//To CLICK CREATE LEAD
		driver.findElement(By.name("submitButton")).click();
		
		String actualtitle = driver.getTitle();
				
		System.out.println("Actual Title = "+actualtitle);
		
		String expectedtitle = "view lead | opentaps CRM";
		
		System.out.println("Expected Title = "+expectedtitle);
		
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title didn't Match");
		}
		
		Thread.sleep(3000);
		
		driver.close();
				

	}

}
