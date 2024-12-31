package Computhink.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

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
        // Capture screenshot on failure
        BaseClass bs = new BaseClass();
        if (bs.driver != null) {
            TakesScreenshot screenshot = (TakesScreenshot) bs.driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Define directory and file name for the screenshot
            String screenshotDir = System.getProperty("user.dir") + "/test-output/screenshots/"; // Ensure screenshots are inside test-output
            String screenshotName = result.getMethod().getMethodName() + "_failure.png";
            File destFile = new File(screenshotDir + screenshotName);

            // Ensure screenshot directory exists
            File screenshotDirectory = new File(screenshotDir);
            if (!screenshotDirectory.exists()) {
                screenshotDirectory.mkdirs();
            }

            try {
                // Save the screenshot
                FileUtils.copyFile(srcFile, destFile);

                // Log the screenshot in the TestNG report
                String relativePath = "screenshots/" + screenshotName; // Relative to test-output
                Reporter.log("<b>Test Failed: " + result.getMethod().getMethodName() + "</b>", true);
                Reporter.log("<a href='" + relativePath + "' target='_blank'>View Screenshot</a>", true);
                Reporter.log("<br><img src='" + relativePath + "' width='400' height='300'/><br>", true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
        // Remove skipped tests with retry analyzers from the context
        context.getSkippedTests().getAllResults()
                .removeIf(result -> result.getMethod().getRetryAnalyzer(result) != null);
    }
}
