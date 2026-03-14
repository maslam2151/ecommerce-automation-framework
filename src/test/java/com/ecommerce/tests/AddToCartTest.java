package com.ecommerce.tests;

import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.InventoryPage;
import com.ecommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addBackpackToCart();
        inventoryPage.openCart();

        Thread.sleep(10000);   // pause 10 seconds so you can see the cart page

        String productName = cartPage.getCartItemName();

        Assert.assertEquals(productName, "Sauce Labs Backpack", "Incorrect product in cart");
    }
}