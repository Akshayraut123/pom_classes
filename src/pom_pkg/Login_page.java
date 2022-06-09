package pom_pkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

WebDriver driver;

//page factory use for after refresh the bom element again initialize 

	@FindBy(xpath = "(//input[@type='text'])[2]")  //page factory class 
	private WebElement emailid1;

	@FindBy(xpath = "(//input[@type='password'])[1]")  //page factory class 
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[2]")  //page factory class 
	private WebElement loginbutton;


	//public By emailid = By.xpath("(//input[@type='text'])[2]");           ///using by class 
	//public By password = By.xpath("(//input[@type='password'])[1]");
	//public By loginbutton = By.xpath("(//button[@type='submit'])[2]");
	
	
	 public Login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public  void putemailid()
	{
		emailid1.sendKeys("akshayraut26117@gmail.com");
		//driver.findElement(emailid1).sendKeys("akshayraut26117@gmail.com"); //using by class
	}
	public  void putpassword()
	{
		password.sendKeys("110219953311");
		//driver.findElement(password).sendKeys("110219953311");
	}
	public  void putloginbutton()
	{
		loginbutton.click();
		//driver.findElement(loginbutton).click();
	}
}
