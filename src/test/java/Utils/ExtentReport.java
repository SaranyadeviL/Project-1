package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;


public class ExtentReport {
        public static ExtentReports getExtentReport() {
            ExtentReports report = new ExtentReports();
            File extentReportfile = new File("C:\\Users\\HP\\IdeaProjects\\Project-1\\src\\test\\ExtentReport\\Report.html");
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportfile);
            report.attachReporter(sparkReporter);
            return report;
        }
    }
