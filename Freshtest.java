package freshtestpkg;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import freshbasepkg.Freshbase;
import freshpagepkg.Freshcartpage;
import freshpagepkg.Freshitempage;
import freshpagepkg.Freshlogin;
import freshpagepkg.Freshregpage;
import freshpagepkg.Myaccount;
import freshpagepkg.Searchpage;
import freshpagepkg.Titlepage;


public class Freshtest extends Freshbase
{
	
	//USER REGISTRATION
	
	@Test(priority=1)
	public void regtest() throws InterruptedException
	{
		Freshregpage ob=new Freshregpage(driver);
		Thread.sleep(3000);
		ob.setValues("mia1","mia1@gmail.com", "1789", "p123", "p123");
		ob.regclick();
		driver.navigate();	
		
		//LOGOUT FROM USER PROFILE
		
		ob.logout();
			

    }
	
	//LOGIN WITH REGISTERED DETAILS
	
	@Test(priority=2)
	public void logintest() throws InterruptedException
	{  
		driver.get(" https://freshdaykart.com/sign-in");
    
		Thread.sleep(3000);
		 Freshlogin ob1=new Freshlogin(driver);
		 driver.navigate();	
		 Thread.sleep(3000);
			ob1.loginsetValues("anu123@gmail.com","anu123");
			ob1.loginclick();
			driver.navigate();
	}
	
	//UPDATE PROFILE ,ADD ADDRESS
	
	@Test(priority=3)
	public void myaccounttest() throws InterruptedException
	{
		
		Myaccount ob6=new Myaccount(driver);
		ob6.addaddress("nandanam","India","Kerala","Kaloor","ernakulam","680684","near church");
	    Thread.sleep(3000);
	}
	
	//ADD ITEMS TO THE CART
	
	@Test(priority=4)
	public void additemtest() throws InterruptedException
	{
		
		//Add from vegetables session
		
		driver.get("https://freshdaykart.com/vegetables?s=s001");
		driver.navigate();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(3000);
		Freshitempage ob2= new Freshitempage(driver);
		Thread.sleep(3000);
		ob2.additemveg();
		Thread.sleep(3000);
		
		//Add from diary session
		
		driver.get("https://freshdaykart.com/milk-butter?s=s0011");
		driver.navigate();
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(3000);
        ob2.additemdiary();
		Thread.sleep(3000);
		
	}
	
	// display items and total in cart 
	
	@Test(priority=5)
	public void viewcarttest() throws InterruptedException
	{
		Freshcartpage ob3=new Freshcartpage(driver);
		ob3.viewcart();
	}
	
	//VERIFY THE LOGO IS DISPLAYED
	
	@Test(priority=6)
	public void titleverification()
	{
		
		Titlepage ob4= new Titlepage(driver);
		ob4.titledisplay();
		
	}
	
	//VERIFY THE FUNCTIONALITY OF SEARCH BAR
	@Test(priority=7)
	public void searchtest()
	{
		Searchpage ob5=new Searchpage(driver);
		ob5.searchitem("nutella");
		driver.close();
	}
	
	
}