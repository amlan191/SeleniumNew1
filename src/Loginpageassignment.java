import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpageassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("password")).sendKeys("learning");
			driver.findElement(By.xpath("//span[normalize-space()='User']")).click();
            WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(15));
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
			driver.findElement(By.id("okayBtn")).click();
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
		    
		    driver.findElement(By.xpath("//option[@value='consult']")).click();
			driver.findElement(By.id("terms")).click();//signInBtn
			driver.findElement(By.id("signInBtn")).click();
		
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));


			List<WebElement>  add = driver.findElements(By.cssSelector(".btn.btn-info"));
		
			for (int i=0;i<add.size();i++) {
				//String [] listadd= add.get(i).getText();
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				
			}
			
			driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
	
	}

}
