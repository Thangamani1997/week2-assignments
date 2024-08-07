package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();

		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// TO LOAD THE URL
		driver.get("http://leaftaps.com/opentaps/.");

		// TO ENTER USER ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// TO ENTER PASSWORD
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// TO PRESS LOGIN BUTTON
		driver.findElement(By.className("decorativeSubmit")).click();

		// TO PRESS CRMSFA TEXT
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// TO PRESS ACCOUNTS TAB
		driver.findElement(By.linkText("Accounts")).click();

		// TO PRESS CREATE ACCOUNT
		driver.findElement(By.linkText("Create Account")).click();

		// TO ENTER ACCOUNT NAME
		driver.findElement(By.id("accountName")).sendKeys("java Selenium");

		// TO ENTER DESCRIPTION
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// TO ENTER NO OF EMPLOYEE
		driver.findElement(By.id("numberEmployees")).sendKeys("6");

		// TO ENTER SITE NAME
		driver.findElement(By.id("officeSiteName")).sendKeys("TestLeaf");

		// To CLICK CREATE ACCOUNT
		driver.findElement(By.className("smallSubmit")).click();

		Thread.sleep(2000);

		System.out.println("Title = " + driver.getTitle());

		driver.close();

	}

}
