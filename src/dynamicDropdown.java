import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amlan\\Downloads\\selenium docs\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		String [] butitem  = {"Brocolli","Tomato","Beans"};
		  List buyitemlist= Arrays.asList(butitem);

		
	   //System.out.println(driver.findElement(By.className("product")).getText());
	   
	  List <WebElement> product=  driver.findElements(By.xpath("//h4[@class='product-name']"));
	  int j=0;
	  for (int i=0;i<product.size();i++) 
	  {
		  
		  String []  name = (product.get(i).getText()).split("-");
		  String formattedname= name[0].trim();
		  System.out.println(formattedname);
		 
		  
		  if (buyitemlist.contains(formattedname)){
			  
			  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			  
			  j++;
			  
			  if (j==butitem.length)
				  
			  {
				  
				  break;
			  }
			  
		  }
	  }		
	}

}
