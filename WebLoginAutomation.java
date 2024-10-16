package com.gravity.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLoginAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.gravity.com/login");
            WebElement usernameField = driver.findElement(By.id("shiva"));
            WebElement passwordField = driver.findElement(By.id("password"));

            usernameField.sendKeys("shiva");
            passwordField.sendKeys("password");

            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            Thread.sleep(2000);
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.equals("https://www.gravity.com/dashboard")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
