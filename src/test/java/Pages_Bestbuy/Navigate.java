package Pages_Bestbuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // open bestbuy website
        driver.get("https://www.bestbuy.com");
        driver.quit();
    }
}
