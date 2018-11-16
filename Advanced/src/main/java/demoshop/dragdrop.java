package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class demoshop {

	
	public void dragdrop() {
		
		WebDriver driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/cart");
		  driver.manage().window().maximize();
	
		WebElement coupon=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[2]"));
		coupon.sendKeys("AUTOMATIONDISCOUNT");		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement apply=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[4]"));
		wait.until(ExpectedConditions.visibilityOf(apply);
		
		
		
	
	
	
	
	
	
	
	}
	
	