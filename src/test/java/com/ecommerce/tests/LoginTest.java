package com.ecommerce.tests;

import com.ecommerce.pages.InventoryPage;
import com.ecommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Perform login
        loginPage.login("standard_user", "secret_sauce");

        // Verify inventory page loaded
        Assert.assertTrue(
                inventoryPage.isInventoryDisplayed(),
                "Inventory page did not load after login"
        );
    }
}