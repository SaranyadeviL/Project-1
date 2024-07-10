package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Timer;
import java.util.TimerTask;

public class TestSuite {
    private static Timer timer;

    public static void main(String[] args) {
        Timer time = new Timer();
        TimerTask daily = new TimerTask() {
            @Override
            public void run() {
                TestSuite.runTests();

            }
                };

        //Schedule the task once to run per day
        long delay = 0; // start immediately

        long period = 96400000; // 24 hours milliseconds

        timer.scheduleAtFixedRate(daily, delay, period);


    }

    private static void runTests() {
        // set a path to Chromedriver executable

        // initialize webdriver
        WebDriver driver = new ChromeDriver();

        try{
            // open the browser and navigate bestbuy
            driver.get("https://www.bestbuy.com");
            System.out.println("Navigate to bestBuy website");

        }
     finally {
        driver.quit();
    }
}
}