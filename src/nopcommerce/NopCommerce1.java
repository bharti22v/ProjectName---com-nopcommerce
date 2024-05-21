package nopcommerce;

/**
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerce1 {
    static WebDriver driver;
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        driver = new ChromeDriver();
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //1. Set up Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        // 4. Print the current url.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        //6. Navigate to Url.
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //7. Print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();

        //9. Navigate to the login page.
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //10. Print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");

        //13 Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Prime123");

        // Step 14: Click on Login Button
        WebElement loginButton = driver.findElement(By.cssSelector("button.login-button"));
        loginButton.click();

        // Step 15: Close the browser
        driver.close();

    }
}







