package test_classes;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import base_pkg.Base_class;
import pom_pkg.Cart_page;
import pom_pkg.Home_page;
import pom_pkg.Login_page;

		public class PurchaseProduct {
			static WebDriver driver;
			Login_page login_page;
			Home_page home_page;

			public static void main(String[] args) throws InterruptedException, IOException {
				// TODO Auto-generated method stub

			   driver = Base_class.getwWebDriver();
				
				Thread.sleep(3000);
				
				PurchaseProduct k= new PurchaseProduct();
				
			}
				
				@SuppressWarnings("unused")
				private void verifyPageLoadedIn10sec() 
				{
					String text= home_page.isPageLoaded();
					
				
				if(text.equals("Mobiles"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
				
		}

		
	}


