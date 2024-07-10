package Tests_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndValidation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

        // Navigate item Menu
        WebElement menuElement = driver.findElement(By.cssSelector("selector menu item"));
        menuElement.click();
        String expectedTitle = "Expected Title";
        if(driver.getTitle().equals(expectedTitle))
        {
            System.out.println("Title Matched");
        }
        // Code for other menu items
        driver.quit();
    }
}
