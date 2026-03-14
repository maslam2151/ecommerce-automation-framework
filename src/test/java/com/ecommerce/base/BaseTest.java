package com.ecommerce.base;

import com.ecommerce.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.getDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void teardown() {

        DriverFactory.quitDriver();

    }
}