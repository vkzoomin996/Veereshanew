package GenericUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeSuite(alwaysRun = true)
	public void launchingBrowser() {
		reporter=new ExtentHtmlReporter("./Reports/extentdemo.html");
		report=new ExtentReports();
		report.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		logger = report.createTest("testcase1");
	}
	@BeforeClass(alwaysRun = true)
	public void navigatingToApp() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		logger.log(Status.INFO, "succesfully navigated to application");
	}

	@AfterMethod(alwaysRun = true)
	public void CheckingFailure(ITestResult result) throws IOException {
		if(result.getStatus()==result.FAILURE) {
			String path = ScreenshotUtility.takingScreenshot(result.getName());
			System.out.println(result.getName());
			logger.log(Status.FAIL, "the test script "+result.getName()+" is failed");
			logger.addScreenCaptureFromPath(path);
			
		}
	}	
	@AfterClass(alwaysRun = true)
	public void loggingOut() {
		System.out.println("logged out");
		logger.log(Status.INFO, "logged out from application");
	}
	@AfterSuite(alwaysRun = true)
	public void tearDownTheBrowser() {
		driver.quit();
		logger.log(Status.INFO, "closed the browser");
		report.flush();
	}
}
