import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locatornew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	

	
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				String password= getPassword(driver);
				
				driver.get("https://www.rahulshettyacademy.com/locatorspractice");
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys(password);
				driver.findElement(By.className("signInBtn")).click();
				
				Thread.sleep(2000);
				
				System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
				Assert.assertEquals(driver.findElement(By.xpath("//div/h1")).getText(), "Welcome to Rahul Shetty Academy");
				Assert.assertEquals (driver.findElement(By.tagName("P")).getText(),"You are successfully logged in.");
				System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
				
				driver.findElement(By.className("logout-btn")).click();
				
				
				
				
	}
	
	
	public static String getPassword (WebDriver driver) throws InterruptedException{
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice");
		//driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//driver.findElement(By.name("inputPassword")).sendKeys("chidi");
		//driver.findElement(By.className("signInBtn")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.out.println (driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String msg =(driver.findElement(By.cssSelector(".infoMsg")).getText());
		String [] password1= msg.split("'");
		String gpp=password1[1].split("'")[0];
		//String actpwd= password2[0];
		return gpp;
	}

}
