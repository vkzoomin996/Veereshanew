package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver ;
		@BeforeSuite
		public void launchingBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@BeforeClass
		public void navigationtoApplication() {
			driver.get("https://demo.actitime.com/login.do");
		}
		@AfterClass
		public void logoutFromApp() {
			System.out.println("logged }out");
		}
		@AfterSuite
		public void closingBrowser() {
			driver.quit();

		
	}
  
		
	}


