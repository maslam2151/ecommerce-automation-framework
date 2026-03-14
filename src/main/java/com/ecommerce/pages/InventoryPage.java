package com.ecommerce.pages;

import com.ecommerce.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By inventoryContainer = By.id("inventory_container");
    private By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isInventoryDisplayed() {

        return WaitUtils.waitForElementVisible(driver, inventoryContainer).isDisplayed();
    }

    public void addBackpackToCart() {

        WaitUtils.waitForElementClickable(driver, addBackpackButton).click();
    }

    public String getCartCount() {

        return WaitUtils.waitForElementVisible(driver, cartBadge).getText();
    }

    public void openCart() {

        WaitUtils.waitForElementClickable(driver, cartIcon).click();
    }
}