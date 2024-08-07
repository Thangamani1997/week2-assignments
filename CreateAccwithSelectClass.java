package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccwithSelectClass {

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
		
		//TO PRESS ACCOUNTS TAB
		driver.findElement(By.linkText("Accounts")).click();
		
		//TO PRESS CREATE ACCOUNT 
		driver.findElement(By.linkText("Create Account")).click();
				
		//TO ENTER ACCOUNT NAME 
		WebElement accountname = driver.findElement(By.id("accountName"));
		accountname.sendKeys("Selenium Testing");
		Thread.sleep(3000);
		String accountname1 = accountname.getAttribute("value");
		System.out.println(accountname1);
		
		//TO ENTER DESCRIPTION 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//TO ENTER INDUSTRY
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		industry.click();
		
		Select option = new Select(industry);
		option.selectByVisibleText("Computer Software");
		
		//TO ENTER OWNERSHIP
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		ownership.click();
		
		Select option1 = new Select(ownership);
		option1.selectByVisibleText("S-Corporation");
		
		//TO ENTER SOURCE
		WebElement source= driver.findElement(By.id("dataSourceId"));
		source.click();
		
		Select option2 = new Select(source);
		option2.selectByValue("LEAD_EMPLOYEE");
		
		//TO ENTER MARKETING CAMPAIGN
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		marketing.click();
		
		Select option3 = new Select(marketing);
		option3.selectByIndex(5);
		
		//TO ENTER STATE/PROVINCE
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		state.click();
		
		Select option4 = new Select(state);
		option4.selectByValue("TX");
		
		//To CLICK CREATE ACCOUNT
		driver.findElement(By.className("smallSubmit")).click();
		
		//TO VERIFY ACCOUNT 
        WebElement verify = driver.findElement(By.xpath("(//span[contains(@class,'tabletext')])[3]"));
        String verifyaccount = verify.getText();
        System.out.println(verifyaccount);
                       
        if(verifyaccount.contains(accountname1))
        {
        	System.out.println("AccountName is matched "+ verifyaccount);
        	
        }
        else
        {
        	System.out.println("Account Name is not matched");
        }
		
		
		Thread.sleep(3000);
		
		
		driver.close();
			
		
	}

}
