package pom_pkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_pkg.Utility_class;


public class Home_page extends Utility_class{
	
WebDriver driver;
	
   @FindBy(xpath = "//input[@type=\\\"text\\\"]")  //using page factory object
   private WebElement searchfield;                    //encapsulation concepts

   @FindBy(xpath = "//img[@title=\"Flipkart\"]")
   private WebElement icon;
   
   @FindBy(xpath="//div[text()=\"Mobiles\"]")
	private WebElement Mobiletext;
	
	@FindBy(xpath="//div[text()=\"Mobiles\"]")
	private WebElement contactUs;
   
	//public By search = By.xpath("//input[@name='q']");  //using By class
	//public By submitbutton = By.xpath("//button[@type=\"submit\"]"); //using By class
	
	
	 public Home_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public  void searchProduct()
	{
		//driver.findElement(search).sendKeys("men shoes");
		searchfield.sendKeys("realme");
	}
	public  void gotoHomepage()
	{
		//driver.findElement(submitbutton).click();
		icon.click();                             
	}
	
	
	public String isPageLoaded()
	{
			WebElement element = explicitWait(driver,Mobiletext, 10);
			String text =element.getText();
			return text;
			
	}
	
	private WebElement explicitWait(WebDriver driver2, WebElement mobiletext2, int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public void clickOnContactUs()
	{
		scrollToElement(contactUs);
		contactUs.click();
	}
		
}
