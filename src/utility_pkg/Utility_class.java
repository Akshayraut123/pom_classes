package utility_pkg;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Utility_class {
		
		
		@SuppressWarnings("deprecation")
		public static void implicitWait(int time,WebDriver driver) 
		{
			driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
		
		public static WebElement explicitWait(WebDriver driver, WebElement element,Duration time)
		{
			WebDriverWait wait = new WebDriverWait (driver,time);
			WebElement element01 = wait.until(ExpectedConditions.visibilityOf(element));
			return element01;
		}
		public static void scrollToElement(WebElement element) 
		{
			
		}

		public static void getScreenShot(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		

		
	}

