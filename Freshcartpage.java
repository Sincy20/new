package freshpagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Freshcartpage
{
	WebDriver driver;
	
	
			
			public Freshcartpage(WebDriver driver)
			{
				
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			public void viewcart() throws InterruptedException
			{  
				driver.get("https://freshdaykart.com/cart");
				Thread.sleep(3000);
			}
}
