package freshpagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage
{
   WebDriver driver;
	
   public Searchpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void searchitem(String item) 
	{
		driver.findElement(By.xpath("/html/body/header/div[3]/div[1]/div[2]/div/form/input ")).sendKeys("nutella");
		driver.findElement(By.xpath(" /html/body/header/div[3]/div[1]/div[2]/div/form/button")).click();
	}
	

}
