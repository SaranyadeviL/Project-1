package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceOrder {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        // Navigate and perform checkout
        WebElement cart = driver.findElement(By.cssSelector("selector cart"));
        cart.click();
        WebElement CheckOut = driver.findElement(By.cssSelector("selector checkout"));
        CheckOut.click();

        // check for order confirmation
        WebElement ConfirmMsg = driver.findElement(By.cssSelector("selector for confirmation message"));
        if(ConfirmMsg.isDisplayed()) {
            System.out.println("Order Placed Successfully");

        }
        driver.quit();
    }
}
