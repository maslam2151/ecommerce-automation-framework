# E-commerce Automation Framework

Automated UI testing framework for an e-commerce application using **Java, Selenium WebDriver, and TestNG**.
The framework follows the **Page Object Model (POM)** design pattern and is structured for scalability and CI/CD integration.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)

---

## Project Structure

```
ecommerce-automation-framework
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ecommerce.pages
│   │
│   └── test
│       └── java
│           ├── com.ecommerce.tests
│           ├── com.ecommerce.listeners
│           └── com.ecommerce.utils
│
├── screenshots
├── pom.xml
└── README.md
```

---

## Features

* Automated login workflow testing
* Add product to cart validation
* Page Object Model architecture
* Screenshot capture on test failure
* Maven-based project structure
* TestNG reporting

---

## Test Scenarios

### Login Test

* Navigate to login page
* Enter valid credentials
* Verify inventory page loads successfully

### Add To Cart Test

* Login to application
* Add product to cart
* Verify correct product appears in cart

---

## Running Tests

Run tests using Maven:

```
mvn test
```

---

## Reports

After test execution, reports are generated in:

```
target/surefire-reports/
```

Open:

```
index.html
```

to view the TestNG execution report.

---

## Author

Mohammed Aslam
Java Backend / Automation Engineer
