package freshpagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Freshitempage
{
	WebDriver driver;

	
 //product2529 garlic
	 
	    @FindBy(xpath=" /html/body/div/div/div[1]/span/div[1]/div/span/b/a")
		WebElement garlic;
// tomato
		
		@FindBy(xpath="/html/body/div/div/div[1]/span/div[3]/div/span/b/a")
		WebElement tomato;
//milk		
		@FindBy(xpath=" /html/body/div/div/div[1]/span/div[2]/div/span/b/a")
		WebElement milk;
		
		public Freshitempage(WebDriver driver)
		{
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void additemveg( ) throws InterruptedException
		{  
			garlic.click();
			System.out.println("garlic added");
			tomato.click();
			System.out.println("garlic added");

		}

		public void additemdiary() throws InterruptedException 
		{
			
			milk.click();
			System.out.println("milk added");
			
		}
		

}
