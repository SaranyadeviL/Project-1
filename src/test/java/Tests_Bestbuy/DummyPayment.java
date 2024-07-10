package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyPayment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        // Navigate to cart
        WebElement cart = driver.findElement(By.cssSelector("selector for cart"));
        cart.click();
        WebElement chkOutButton = driver.findElement(By.cssSelector("selector for checkout"));
        chkOutButton.click();

        // Fill out payment form with dummy data
        WebElement cardNum = driver.findElement(By.id("Card Number"));
        cardNum.sendKeys("516171111111");
        WebElement ExpDate = driver.findElement(By.id("Expiry Date"));
        ExpDate.sendKeys("10/28");

        WebElement cvv = driver.findElement(By.id("cvv number"));
        cvv.sendKeys("859");

        WebElement PlaceOrder = driver.findElement(By.cssSelector("Selector place order"));

        driver.quit();

    }
}
