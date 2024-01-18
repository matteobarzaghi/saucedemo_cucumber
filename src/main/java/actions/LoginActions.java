package actions;

import driver.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginActions {
    private final WebDriver driver;

    public LoginActions() {
        driver = WebDriverSetup.getDriver();
    }

    public void landing() {
        driver.get("https://www.saucedemo.com/");
        try {
            Thread.sleep(3000); // Waits for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void login(String role) {

        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys(role);

        try {
            Thread.sleep(3000); // Waits for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");

        try {
            Thread.sleep(3000); // Waits for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void closeBrowser() {
        WebDriverSetup.closeDriver();
    }
}