import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angularPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.name("name")).sendKeys("amlan");
//		driver.findElement(By.name("email")).sendKeys("amlan@gmail.com");
//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ABCDEF");
//		driver.findElement(By.id("exampleCheck1")).click();
//		Select  ABC =new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
//		ABC.selectByVisibleText("Female");
//	    driver.findElement(By.id("inlineRadio1")).click();
//	    driver.findElement(By.name("bday")).sendKeys("21/01/1996");
//	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
//	    Thread.sleep(2000);
//         System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
//         System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
         
         driver.get("https://www.tcs.com/");
         System.out.println (driver.findElement(By.xpath("//h1[contains(text(),'Cloud with capacity, control, and customization')]")).getText());
         
	}

}
