package Pages_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemByDepartment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        WebElement deptMenu = driver.findElement(By.cssSelector("selector department"));
        deptMenu.click();
        WebElement item = driver.findElement(By.cssSelector("selector item"));
        item.click();
        WebElement addToCart = driver.findElement(By.cssSelector("selector add to cart"));
        addToCart.click();

        driver.quit();

    }
}
