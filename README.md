# E-commerce Automation Framework

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Automation-red)
![Build](https://img.shields.io/badge/Build-Maven-blue)
![License](https://img.shields.io/badge/license-MIT-blue)

A **UI automation testing framework** built using **Java, Selenium WebDriver, and TestNG** to validate core workflows of an e-commerce web application.

The framework follows the **Page Object Model (POM)** design pattern and is designed for **scalability, maintainability, and CI/CD integration**.

This project simulates real-world **QA automation practices used in production test frameworks**.

---

# Table of Contents

* [Project Overview](#project-overview)
* [Framework Components](#framework-components)
* [Framework Architecture](#framework-architecture)
* [Test Automation Workflow](#test-automation-workflow)
* [Project Structure](#project-structure)
* [Tech Stack](#tech-stack)
* [Framework Features](#framework-features)
* [Test Scenarios](#test-scenarios)
* [Framework Execution](#framework-execution)
* [Test Reports](#test-reports)
* [Running the Tests](#running-the-tests)
* [Future Improvements](#future-improvements)
* [Author](#author)

---

# Project Overview

This project demonstrates a **Selenium automation framework** designed to test key workflows of an e-commerce platform.

The framework automates common user interactions such as:

* User authentication
* Product browsing
* Adding products to the cart
* Cart verification

The framework follows the **Page Object Model (POM)** design pattern to maintain a clean separation between:

* Test logic
* Page UI interactions
* Utility components

This improves **maintainability, scalability, and reusability of automation code**.

---

# Framework Components

The automation framework contains the following major components:

| Component       | Responsibility                        |
| --------------- | ------------------------------------- |
| Test Classes    | Define automation scenarios           |
| Page Classes    | Encapsulate page elements and actions |
| Driver Factory  | Manages WebDriver initialization      |
| Test Listener   | Captures screenshots on failures      |
| Utility Classes | Provide reusable helper functions     |

---

# Framework Architecture

The framework follows a **Page Object Model (POM)** architecture.

Each page of the application has its own **Page Class** containing:

* Element locators
* Page actions
* UI validations

Tests interact with **page objects**, not directly with Selenium commands.

Benefits:

* Improves readability
* Reduces code duplication
* Simplifies maintenance
* Promotes reusable automation components

Architecture Flow:

```
Test Classes → Page Objects → WebDriver → Web Application
```

---

# Test Automation Workflow

Automation execution follows this flow:

1. WebDriver initializes the browser.
2. TestNG triggers the test suite.
3. Test classes execute automation steps.
4. Page Objects interact with web elements.
5. TestNG generates execution reports.
6. Screenshots are captured for failures.

---

# Project Structure

```
ecommerce-automation-framework
│
├── screenshots
│   ├── framework-run.png
│   ├── framework-cart.png
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ecommerce.pages
│   │           ├── LoginPage.java
│   │           └── InventoryPage.java
│   │
│   └── test
│       └── java
│           ├── com.ecommerce.tests
│           │   ├── LoginTest.java
│           │   └── AddToCartTest.java
│           │
│           ├── com.ecommerce.listeners
│           │   └── TestListener.java
│           │
│           └── com.ecommerce.utils
│               ├── DriverFactory.java
│               └── ScreenshotUtils.java
│
├── pom.xml
└── README.md
```

---

# Tech Stack

| Category          | Technology         |
| ----------------- | ------------------ |
| Language          | Java               |
| Automation        | Selenium WebDriver |
| Testing Framework | TestNG             |
| Build Tool        | Maven              |
| Design Pattern    | Page Object Model  |
| Version Control   | Git / GitHub       |

---

# Framework Features

The framework includes the following features:

* Page Object Model architecture
* Modular automation design
* Screenshot capture on test failure
* TestNG-based execution
* Maven dependency management
* Clean and scalable project structure

---

# Test Scenarios

## Login Test

Validates that a user can successfully log into the application.

Steps:

1. Navigate to the login page
2. Enter valid credentials
3. Submit login request
4. Verify inventory page loads successfully

---

## Add To Cart Test

Validates that a product can be added to the cart.

Steps:

1. Login to the application
2. Select a product
3. Add the product to the cart
4. Open the cart page
5. Verify the correct product is displayed

---

# Framework Execution

Example automation execution showing successful login and product selection.

### Inventory Page Validation

![Automation Run](screenshots/framework-run.png)

---

### Cart Page Validation

Product successfully added to the cart.

![Cart Screenshot](screenshots/framework-cart.png)

---

# Test Reports

After executing tests using Maven, TestNG generates reports in:

```
target/surefire-reports/
```

Open the report file:

```
index.html
```

to view execution results.

Reports include:

* Passed / Failed tests
* Execution time
* Detailed test logs
* Stack traces for failures

---

# Running the Tests

Execute the entire test suite using Maven:

```
mvn test
```

This will:

1. Launch the browser
2. Execute all TestNG tests
3. Generate execution reports

---

# Future Improvements

Potential enhancements for production-level automation:

* Parallel test execution
* Selenium Grid integration
* Jenkins CI/CD pipeline
* Allure reporting integration
* Dockerized test execution
* Cross-browser testing

---

# Author

Mohammed Aslam
Java Backend / QA Automation Engineer

GitHub:
https://github.com/maslam2151
