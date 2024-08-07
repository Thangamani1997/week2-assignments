package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get("https://leafground.com/checkbox.xhtml");
		
			
		//TO SELECT CHECK BOX (basics)
		WebElement basics = driver.findElement(By.xpath("//span[text()='Basic']"));
		basics.click();
		
		//TO VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		if(basics.isEnabled()==true)
		{
			System.out.println("Basics is Selected");
		}
		else
		{
			System.out.println("Basics is Not Selected");
		}
		
		//TO SELECT CHECK BOX (ajax) & VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		WebElement ajax = driver.findElement(By.xpath("//span[text()='Ajax']"));
		ajax.click();
	
		if(ajax.isEnabled()==true)
		{
			System.out.println("Ajax is Selected");
		}
		else
		{
			System.out.println("Ajax is Not Selected");
		}
		
		//TO SELECT CHECK BOX (java) & & VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		WebElement java = driver.findElement(By.xpath("//label[text()='Java']"));
		java.click();
						
		if(java.isEnabled()==true)
		{
			System.out.println("Java is one of my favorite language");
		}
		else
		{
			System.out.println("Java is not one of my favorite language");
		}
		
		//TO SELECT CHECK BOX (python) & VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		WebElement python = driver.findElement(By.xpath("//label[text()='Python']"));
		python.click();
	
		if(python.isEnabled()==true)
		{
			System.out.println("Python is one of my favorite language");
		}
		else
		{
			System.out.println("Python is not one of my favorite language");
		}
		
		//TO SELECT CHECK BOX (tri-state) & VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		WebElement tristate = driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']"));
		tristate.click();
			
		if(tristate.isEnabled()==true)
		{
			System.out.println("Tri State checkbox is selected");
		}
		else
		{
			System.out.println("Tri State checkbox is not selected");
		}
		
		//TO SELECT TOOGLE BUTTON (toogle) & VERIFY IF THE CHECK BOX IS SELECTED OR NOT
		WebElement toogle = driver.findElement(By.className("ui-toggleswitch-slider"));
		toogle.click();
					
		if(toogle.isEnabled()==true)
		{
			System.out.println("Toogle switch is on");
		}
		else
		{
			System.out.println("Toogle switch is off");
		}
		
		//TO CHECK THE CHECKBOX IS DISABLED OR NOT
		WebElement disable = driver.findElement(By.xpath("//span[text()=\"Disabled\"]"));
									
		if(disable.isEnabled()==true)
		{
			System.out.println("checkbox is enabled");
		}
		else
		{
			System.out.println("checkbox is disabled");
		}
		
		//TO SELECT MULTIPLE
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
		
		//TO SELECT OPTIONS IN MULTIPLES
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		
		//TO CLOSE THE DROP DWON
		driver.findElement(By.xpath("//a[contains(@class,'ui-selectcheckboxmenu-close ui-corner-all')]")).click();
		
		Thread.sleep(3000);
		
		driver.close();	
	}

}
