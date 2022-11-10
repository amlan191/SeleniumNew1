import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.cssSelector("a.button:nth-child(2)")).click();
		//driver.findElement(By.xpath("//a[text()='Sign in'])")).click();
		driver.findElement(By.id("identifierId")).sendKeys("aml.aurkya@gmail.com");
		 
	}

}
