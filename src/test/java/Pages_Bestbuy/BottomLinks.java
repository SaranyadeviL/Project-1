package Pages_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BottomLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        // Validating a bottom link
        WebElement botLink = driver.findElement(By.cssSelector("Selector bottom Link"));
        botLink.click();

        // validation for perform
        driver.quit();
    }
}
