package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	@Test
	public void Extent() {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/report2.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest logger=report.createTest("Test 1");
		logger.pass("it is passed");
		logger.fail("it is failed");
		logger.info("it is a information");
		report.flush();
				
		       
	}

}
