package Advanced;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class HDFC {
  @Test
  public void Demat() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("");
	  driver.manage.window().maximize();
	  
	  driver.findElement(By.cssSelector("a(')")
			  
	  Actions act1=new Actions(driver);
	  act1.moveToElement(driver.findElement(By.cssSelector("a['href=/personal/products']"]))).perform();
	  Thread.sleep(2000);
	  act1.moveToElement(driver.findElement(By.cssSelector("a['href=/personal/products/demat']"]))).perform();
	
	  
	  driver.findElements(')
	  
	  
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
<a class="mainlink" target="" href="/personal/products/demat">Demat</a>