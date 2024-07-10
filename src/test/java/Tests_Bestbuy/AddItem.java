package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItem {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        WebElement searchBox = driver.findElement(By.id("Search box"));
        searchBox.sendKeys("item Name");
        searchBox.submit();

        WebElement item = driver.findElement(By.cssSelector("selector item"));
        item.click();
        WebElement addToCart = driver.findElement(By.cssSelector("selector add to cart"));
        addToCart.click();

        driver.quit();

    }
}
