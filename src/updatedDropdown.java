import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
			Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		
	
	}

}
