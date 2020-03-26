package PL_Auto;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class partner_app {
	WebDriver driver=new FirefoxDriver();	 
	  @BeforeTest
	  public void launch_app() {
		  //WebDriver driver;
		  System.setProperty("webdriver.firefox.marionette","C:\\geckodriver-v0.18.0-win64");
		  //driver =new FirefoxDriver();
		  String baseURL="http://qa.partnerlink.savearound.com";
		  driver.get(baseURL);
		  
	  }
	  @Test
	  public void tc_validlogin() {
		  //WebDriver driver=null;
		driver.findElement(By.xpath("//input[@id='loginModel_Email']")).sendKeys("abc@zmail.com");
		driver.findElement(By.xpath("//*[@id='loginModel_Password']")).sendKeys("abc@zmail.com");
		driver.findElement(By.xpath("//*[@id='BtnLogIn']")).click();
		
		//driver.findElement(By.id("BillingCity")).sendKeys("NewCity");
	  }
	  @AfterTest
	  public void tc_closebrowser(){
	  //driver.close();
		System.exit(0);
	  }
	}