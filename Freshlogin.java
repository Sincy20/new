package freshpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Freshlogin
{
	
	WebDriver driver;
	
    
	   @FindBy(xpath="/html/body/div[2]/div/form[1]/div[1]/input")
		WebElement email;

		@FindBy(xpath="/html/body/div[2]/div/form[1]/div[2]/input")
		WebElement password;
		
		@FindBy(xpath="/html/body/div[2]/div/form[1]/button")
		WebElement login;
		
		public Freshlogin(WebDriver driver)
		{
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void loginsetValues( String em,String pass1)
		{  
			email.sendKeys(em);
			password.sendKeys(pass1);

		}
		public void loginclick()
		{
			
			login.click();
		}
		
		
		

}
