package actions;

import driver.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions {
    private final WebDriver driver;

    public Actions() {
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

    public String checkHomepage() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
        return element.getText();
    }

    public String checkLabel() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
        return element.getText();
    }
}