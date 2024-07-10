package Tests_Bestbuy;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Optional;
//import org.testng.annotations.parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;


    @BeforeMethod
//    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser){
            if(browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                FirefoxOptions options2 = new FirefoxOptions();

//            } else if (browser.equalsIgnoreCase("firefox")) {
//                FirefoxOptions options = new FirefoxOptions();
//                options.addArguments("--disable-notifications");
//                driver = new FirefoxDriver(options2);
//            }

//                driver = new ChromeDriver(options);

        /*if (browser.equalsIgnoreCase("chrome")) {
            options.addArguments("--headless");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        }*/
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.get("https://www.bestbuy.com/");
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                }
            }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static String TakeScreenshot(String testName) {
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\HP\\IdeaProjects\\Project-1\\src\\test\\Screenshot\\" + testName + ".png");
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());


        try {
            FileUtils.copyFile(srcFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String path = "<img src= " + destinationFile.getAbsolutePath() + "width 200px height = 200px />";
        Reporter.log(path);
        return destinationFile.getAbsolutePath();
    }
}

