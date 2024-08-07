package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get("https://leafground.com/button.xhtml");
					
		//TO SELECT CHECK BOX (basics)
		WebElement click = driver.findElement(By.xpath("//span[text()='Click']"));
		click.click();
		
		String title = driver.getTitle();
		System.out.println("Title = "+title);
		
		//TO NAVIGATE TO PREVIOUS PAGE
		driver. navigate(). back();
		
		//TO COMFIRM THE BUTTON IS DISABLED
		WebElement disable = driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
											
		if(disable.isEnabled()==true)
		{
			System.out.println("checkbox is enabled");
		}
		else
		{
			System.out.println("checkbox is disabled");
		}
			
		//TO GET THE POSITION OF SUBMIT BUTTON
		WebElement submit = driver.findElement(By.xpath("//button[contains(@class,'text-icon-left mr-2')]"));
		System.out.println(" Position of submit is "+submit.getLocation());
		
		//TO PRINT THE BACKGROUND COLOR OF THE SAVE BUTTON
		WebElement save = driver.findElement(By.xpath("//button[contains(@class,'secondary mr-2 mb-2')]"));
		System.out.println("Background color of save is "+save.getCssValue("background-color"));
		
		//TO PRINT THE HEIGHT & WIDTH OF SUBMIT BUTTON
		WebElement size = driver.findElement(By.xpath("//button[contains(@class,'button-text-icon-right')]"));
		System.out.println("Height & width of submit is "+size.getSize());
		
		driver.close();
				
	}

}
