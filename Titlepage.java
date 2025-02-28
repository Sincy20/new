package freshpagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Titlepage
{

	 WebDriver driver;
	
	
	public Titlepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void titledisplay() 
	{
		boolean logo= driver.findElement(By.xpath(" /html/body/header/div[3]/div[1]/div[1]/a/img")).isDisplayed();
	     
	     if (logo)
	     {
	   	  System.out.println("logo is displayed");
	   	  
	      }
	     else
	     {
	   	  System.out.println("logo is not displayed");
	     }
	     
	     
      
	}
	

}
