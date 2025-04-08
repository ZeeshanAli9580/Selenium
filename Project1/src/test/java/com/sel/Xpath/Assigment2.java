package com.sel.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {


    public static void main(String[] args) throws InterruptedException {
        // Set system property for ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver for Chrome
        WebDriver driver = new FirefoxDriver();


        // Open Oracle Registration page
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

        // Maximize browser window
        driver.manage().window().maximize();

        // Fill in the form fields
        driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("testemail@example.com"); // Email
        driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Test@1234");         // Password
        driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Test@1234");  // Confirm Password
        driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("TestZee");            // First Name
        driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("TestAll");              // Last Name
        driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Engineer");         // Job Title

        // Select a value from a dropdown (Country)
        WebElement countryDropdown = driver.findElement(By.id("sView1:r1:0:country::content"));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("India");

        // Input other details (Phone Number)
        driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("+911234567890");

        // Check the consent checkbox (if applicable)
        WebElement consentCheckbox = driver.findElement(By.id("sView1:r1:0:termsAccepted::content"));
        if (!consentCheckbox.isSelected()) {
            consentCheckbox.click();
        }

        // Click the 'Create Account' button
        driver.findElement(By.id("sView1:r1:0:b1")).click();


        // Close the browser
        Thread.sleep(2000);
        driver.quit();
    }

}

