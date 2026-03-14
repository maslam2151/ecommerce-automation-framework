package com.ecommerce.listeners;

import com.ecommerce.tests.BaseTest;
import com.ecommerce.utils.ScreenshotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName();

        ScreenshotUtils.captureScreenshot(BaseTest.driver, testName);

        System.out.println("Screenshot captured for failed test: " + testName);
    }
}