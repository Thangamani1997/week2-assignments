package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		//TO PRESS FIND LEAD
		driver.findElement(By.linkText("Find Leads")).click();
		
		//TO PRESS PHONE
		driver.findElement(By.linkText("Phone")).click();
		
		//TO PRESS PHONE
		driver.findElement(By.name("phoneNumber")).sendKeys("9944263157");
		Thread.sleep(3000);
		//TO PRESS FIND LEADS
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		//TO SELECT 1ST LEAD
		WebElement lead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]"));
		String leadid = lead.getText();
		System.out.println("Lead id = " +leadid);
		lead.click();
			
		Thread.sleep(3000);
		//TO PRESS DELETE
		driver.findElement(By.linkText("Delete")).click();
		
		//TO PRESS FIND LEADS
		driver.findElement(By.linkText("Find Leads")).click();
		
		//TO PRESS NAME&ID
		driver.findElement(By.linkText("Name and ID")).click();
		
		//TO TYPE LEAD ID
		driver.findElement(By.xpath("//span[text()='Advanced']/following::input")).sendKeys(leadid);
		Thread.sleep(3000);
		//TO PRESS FIND LEADS
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);

		//TO VERIFY THE MESSAGE NO RECORDS FOUND 
		String message = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]")).getText();
		System.out.println(message);
		
				
		
		
	}

}
