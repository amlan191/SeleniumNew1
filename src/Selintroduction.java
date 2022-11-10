import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.edge.driver","C:\\Users\\Amlan\\Downloads\\selenium docs\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.xv-videos1.com/");
		  driver.getTitle();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //driver.close();
	}

}
