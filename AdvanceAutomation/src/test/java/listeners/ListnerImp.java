package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test is started");
		 
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test is success");
		 
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failure");
		 
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
		 
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test failed but within success Percentage");
		 
	}

	

	public void onStart(ITestContext context) {
		System.out.println("test on start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("test on finish");
	}
}
	 
