import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazonajaxcall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			Actions a =new Actions(driver);
			a.moveToElement(driver.findElement(By.cssSelector("div[class='nav-line-1-container']"))).build().perform();
			
	        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().contextClick().build().perform();
			
	        System.out.println("Asia change");
	        System.out.println("Asia change2");
	        
	        System.out.println("US change");

	        

	}

}
