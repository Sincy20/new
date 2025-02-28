package freshpagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Myaccount 
{
  WebDriver driver;
 // @FindBy(xpath="//*[@id=\\\"new_ad\\\"]/div/form/div[1]/input ")
		//WebElement housename;


  
  
  
  public Myaccount(WebDriver driver) 
  {
	  this.driver=driver;
		PageFactory.initElements(driver,this);
	// TODO Auto-generated constructor stub
}



public void addaddress(String hn,String co,String st,String cir,String cit,String pin,String mark) throws InterruptedException
	
	{
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div/p[2]/a")).click();	
		 driver.navigate();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,200)", "");
		// xpath of add address is dynamic.so we can find xpath based on text
		 driver.findElement(By.xpath("//*[text()='Add Address']")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/div[1]/input")).sendKeys(hn);
		
		 new Select(driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/div[2]/select"))).selectByContainsVisibleText(co);
		 new Select(driver.findElement(By.xpath("//*[@id=\"state_div_2\"]/select"))).selectByContainsVisibleText(st);
		 new Select(driver.findElement(By.xpath("//*[@id=\"loc_div_2\"]/select"))).selectByContainsVisibleText(cir);
		 driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/div[5]/input")).sendKeys(cit);
		 driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/div[6]/input")).sendKeys(pin);
		 driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/div[7]/input")).sendKeys(mark);
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"new_ad\"]/div/form/button")).click();
	}

}
