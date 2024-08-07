package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get("https://www.leafground.com/radio.xhtml");
		
			
		//TO SELECT MOST FAVOURITE BROWSER
		WebElement chrome = driver.findElement(By.xpath("//label[text()='Chrome']"));
		chrome.click();
		String browser = chrome.getText();
		System.out.println("Selected browser is "+browser);
		
		//TO SELECT THE RADIO BUTTON
		WebElement select = driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		select.click();
		Thread.sleep(3000);
		String place = driver.findElement(By.xpath("//label[text()='Chennai']")).getText();
		System.out.println("Selected Place is "+place);
		
		//TO UNSELCT THE RADIO BUTTON
		if(select.isEnabled())
		{
			System.out.println("Chennai is selected");
		}
		else 
		{
			select.click();
			System.out.println("Chennai is unselected");
		}
		
		//TO Find the default select radio button
		WebElement defaultselect = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[4]/span"));
	    
		if(defaultselect.isEnabled())
	    {
	    	System.out.println("Safari is Selected by Default");
	    }
	    else 
		{
			System.out.println("Safari is not Selected by Default");
		}
	    
		
		//Check and select the age group (21-40 Years) if not already selected.
	    WebElement age = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]/span"));
	    if(age.isEnabled())
	    {
	    	System.out.println("Age Group 21-40 is Selected by Default");
	    }
	    else 
		{
			System.out.println("Age roup 21-40 is not Selected by Default");
		}
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	}
	
	

}
