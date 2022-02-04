package listeners;

import listeners.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class CustomListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

        TakesScreenshot takesScreenshot = (TakesScreenshot) BaseClass.driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            File destFile = new File("./Screenshots/" + result.getName() + ".jpg");
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but Success Percentage: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Starts Test Execution: " + context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish Test Execution: " + context);
    }
}
