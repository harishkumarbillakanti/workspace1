package loginPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailclass {

	public static void main(String[] args) throws InterruptedException 
	{
		// open browser		
		   WebDriver d=new FirefoxDriver();
		   
		
		// type url
		   Thread.sleep(5000);
		   d.get("http://www.google.co.in");
		   
				
		// click on sign in button
		   Thread.sleep(5000);
		   d.findElement(By.id("gb_70")).click();
		   
		
		// enter email id in textbox
		   Thread.sleep(5000);
		   d.findElement(By.name("Email")).sendKeys("harishbillakanti09@gmail.com");
		   
		
		// click on next button
		   Thread.sleep(5000);
		   d.findElement(By.xpath(".//*[@id='next']")).click();
		   
				
		// enter the password in textbox
		   Thread.sleep(5000);
		   d.findElement(By.id("Passwd")).sendKeys("harish4u");
		
		// click on sign in button
		   Thread.sleep(5000);
		   d.findElement(By.id("signIn")).click();
		   
		
		// click on gmail link
		   Thread.sleep(5000);
		   d.findElement(By.linkText("Gmail")).click();	   
		   		
				

	}

}