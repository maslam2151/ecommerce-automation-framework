package com.ecommerce.pages;

import com.ecommerce.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {

        WaitUtils.waitForElementVisible(driver, usernameField).sendKeys(username);
        WaitUtils.waitForElementVisible(driver, passwordField).sendKeys(password);

        WaitUtils.waitForElementClickable(driver, loginButton).click();
    }
}