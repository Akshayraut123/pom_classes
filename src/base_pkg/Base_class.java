package base_pkg;



	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Base_class {
		
		public static WebDriver getwWebDriver()
		{
			
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
				WebDriver  driver = new ChromeDriver();	
		    	driver.get("https://www.flipkart.com/");
			    driver.manage().window().maximize();
		     	return driver;
			
		}

//		public static WebDriver getDriver()
//		{
//			System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();	
//			
//			driver.get("https://www.flipkart.com/");
//			driver.manage().window().maximize();
//			
//			return driver;
//			
//		}
		
	}

