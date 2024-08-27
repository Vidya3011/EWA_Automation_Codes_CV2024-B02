package Generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//NishaR codes

public class CustomTestLisner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// No implementation needed
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// No implementation needed
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// No implementation needed
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// No implementation needed
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// No implementation needed
	}

	@Override
	public void onStart(ITestContext context) {
		// No implementation needed
	}

	@Override
	public void onFinish(ITestContext context) {
		// context.getFailedTests().getAllResults().removeIf(result ->
		// result.getMethod().getRetryAnalyzer() != null);
		context.getSkippedTests().getAllResults().removeIf(result -> result.getMethod().getRetryAnalyzer(result) != null);
	}

}
