package freshpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Freshregpage 
{
	WebDriver driver;
	
	    
	   @FindBy(xpath="/html/body/div[2]/div/form/div[1]/input")
		WebElement fullname;

		@FindBy(xpath="/html/body/div[2]/div/form/div[2]/input")
		WebElement email;


		@FindBy(xpath="/html/body/div[2]/div/form/div[3]/input")
		WebElement phone;


		@FindBy(xpath="/html/body/div[2]/div/form/div[4]/input")
		WebElement password1;


		@FindBy(xpath="/html/body/div[2]/div/form/div[5]/input")
		WebElement password2;

		@FindBy(xpath="/html/body/div[2]/div/form/button")
		WebElement register;
	    
		@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[2]/div/p[5]/a")
		WebElement logout;
		//constructor
		public Freshregpage(WebDriver driver)
		{
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}


		public void setValues(String name, String em, String ph,String pass1,String pass2)
		{  
			fullname.sendKeys(name);
			email.sendKeys(em);
			phone.sendKeys(ph);
			password1.sendKeys(pass1);
			password2.sendKeys(pass2);
			
			
		}


		public void regclick()
		{
			
			register.click();
		}
		public void logout()
		{
			logout.click();
		}
		
		

}
