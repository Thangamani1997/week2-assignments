package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead
{

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
						
		//TO ENTER COMPANY NAME
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
						
		//TO ENTER FIRST NAME 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prithiviga Sri");
							
		//TO ENTER LAST NAME 
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Saravanan");
				
		//TO ENTER FIRST NAME(lOCAL) 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Prithiviga Sri Saravanan");
							
		//TO ENTER DEPARTMENT 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
									
		//TO ENTER DESCRIPTION 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead");
		
		//TO ENTER MAILID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayu@gmail.com");

		//TO SELECT STATE
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.click();
		
		Select option = new Select(state);
		option.selectByVisibleText("New York");

		//To CLICK CREATE LEAD
		driver.findElement(By.name("submitButton")).click();
		
		//To CLICK EDIT LEAD
		driver.findElement(By.linkText("Edit")).click();
				
		//TO CLEAR THE DESCRIPTION	
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//TO ENTER IMPORTANT NOTE
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Senior Lead");
		
		//To CLICK UPDATE LEAD
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
				

	}
}
