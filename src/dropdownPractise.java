import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdownPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement currencydropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				
		Select currency= new Select(currencydropdown);
		
		currency.selectByIndex(3);
		currency.getFirstSelectedOption().getText();
		Assert.assertEquals(currency.getFirstSelectedOption().getText(), "USD");
		//Thread.sleep(25000);
		currency.selectByVisibleText("INR");
		currency.selectByValue("AED");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i=0;i<4;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}
	
	  driver.findElement(By.id("btnclosepaxoption")).click();
	  
	 String count= driver.findElement(By.id("divpaxinfo")).getText();
	 String countsplit[]= count.split(" Adult");
	 Assert.assertEquals(countsplit[0], "5"); 
	 
	}

}
