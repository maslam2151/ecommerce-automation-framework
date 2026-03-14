package com.ecommerce.tests;

import com.ecommerce.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(com.ecommerce.listeners.TestListener.class)

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = DriverFactory.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}