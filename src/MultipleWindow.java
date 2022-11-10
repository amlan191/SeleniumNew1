import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/windows");
			driver.findElement(By.xpath("//div/a[contains(text(),'Click Here')]")).click();
			Set<String>number=driver.getWindowHandles();
			 Iterator<String> a = number.iterator();
			 String parentwindow= a.next();
			 String child= a.next();
			 driver.switchTo().window(child);
			 //WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
			// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h3[contains(text(),'New Window')]")));
			String childmsg= driver.findElement(By.xpath("//div/h3[contains(text(),'New Window')]")).getText();
			driver.switchTo().window(parentwindow);//Opening a new window
			String parentmsg= driver.findElement(By.xpath("//div/h3[contains(text(),'Opening a new window')]")).getText();
			
			System.out.println("The child windown msg is"+childmsg);
			System.out.println("The parent  windown msg is"+parentmsg);

			


			 


	}

}
