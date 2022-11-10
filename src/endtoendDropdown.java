import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class endtoendDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			
		{
			
			System.out.println ("is enabled");
		    Assert.assertTrue(true);
		    
		}
		else {
			
			System.out.println ("is disabled");
		    Assert.assertTrue(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		for (int i=1;i<5;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
		}
	
		
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
		 
		WebElement Currency=  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select Currencydrop = new Select(Currency);
        
        Currencydrop.selectByVisibleText("AED");
        
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
