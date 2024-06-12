package actions;

import driver.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginActions {
    private final WebDriver driver;

    public LoginActions() {
        driver = WebDriverSetup.getDriver();
    }

    public void landing() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String role) {

        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys(role);
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();

    }

    public void closeBrowser() {
        WebDriverSetup.closeDriver();
    }

    public String checkHomepage() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
        return element.getText();
    }

    public String checkLabel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
        return element.getText();
    }
}