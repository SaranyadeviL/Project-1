package Utils;



import Tests_Bestbuy.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestNgListener extends BaseClass implements ITestListener
{

    ExtentReports report = ExtentReport.getExtentReport();
    ExtentTest eTest;


    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getName();
        eTest = report.createTest(testName).assignAuthor("Saranyadevi").assignCategory("FunctionalTesting").assignDevice("Windows");
        eTest.log(Status.INFO, testName + " execution started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testName = result.getName();
        eTest.log(Status.PASS, testName + " got successfully executed");
        String screenshotPath = TakeScreenshot(testName);
        try {
            eTest.addScreenCaptureFromPath(screenshotPath); // Add screenshot to Extent Report
        } catch (Exception e) {
            throw new RuntimeException("Failed to attach screenshot to report", e);
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        eTest.log(Status.FAIL, testName + " got failed");
        eTest.log(Status.INFO, result.getThrowable());
        String screenshotPath = TakeScreenshot(testName);
        try {
            eTest.addScreenCaptureFromPath(screenshotPath); // Add screenshot to Extent Report
        } catch (Exception e) {
            throw new RuntimeException("Failed to attach screenshot to report", e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String testName = result.getName();

        eTest.log(Status.SKIP, testName + " Test skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not implemented
    }


    @Override
    public void onStart(ITestContext context)
    {

    }

    @Override
    public void onFinish(ITestContext context) {
        report.flush();
        File eReportFile = new File("C:\\Users\\HP\\IdeaProjects\\Project-1\\src\\test\\ExtentReport\\report.html" );
        try {
            Desktop.getDesktop().browse(eReportFile.toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}