package crossbrowserexecutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cbt2 {
	public static  WebDriver driver;
	@Test
	@Parameters("browser")
	public void crossbrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		else if((browserName.equalsIgnoreCase("firebox"))){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			
		}
		
	}
	
	

}
