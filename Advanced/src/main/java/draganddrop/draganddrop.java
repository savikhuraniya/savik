package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class draganddrop {

	@Test
	public void dragdrop() {
	
	WebDriver driver=new ChromeDriver();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	
	WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	WebElement to=driver.findElement(By.id("//*[@id=\"ctl00_ContentPlaceholder1_Label1\"]"));
	
	
	Actions act1=new Actions(driver);
	act1.clickAndHold(from).release(to).perform();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text))
	String price=driver.findElements(By.id("")).getText();
	System.out.println(price);
	
	
	
	
	
	
	
	
	}
	
	
}
