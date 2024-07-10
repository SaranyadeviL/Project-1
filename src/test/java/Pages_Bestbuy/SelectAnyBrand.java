package Pages_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAnyBrand {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        WebElement BrandMenu = driver.findElement(By.cssSelector("selector by brand"));
        BrandMenu.click();
        WebElement BrandItem = driver.findElement(By.cssSelector("selector by brand item"));
        BrandItem.click();
        WebElement addToCart = driver.findElement(By.cssSelector("selector add to cart"));
        addToCart.click();

        driver.quit();
    }
}
