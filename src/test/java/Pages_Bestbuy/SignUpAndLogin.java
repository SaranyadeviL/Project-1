package Pages_Bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpAndLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");

    // for login
    WebElement signInButton = driver.findElement(By.cssSelector("selector-for-sign-in"));
    signInButton.click();
    WebElement emailField = driver.findElement(By.id("email"));
    WebElement passwordField = driver.findElement(By.id("password"));

    emailField.sendKeys("email");
    passwordField.sendKeys("password");
    WebElement loginButton = driver.findElement(By.cssSelector("selector for login"));
    loginButton.click();

    // Add code for signup
    driver.quit();
    }
}

