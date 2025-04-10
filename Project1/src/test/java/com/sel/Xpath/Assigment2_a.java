package com.sel.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2_a {


    public static void main(String[] args) throws InterruptedException {
        // Set system property for ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver for Chrome
        WebDriver driver = new ChromeDriver();


        // Open Oracle Registration page
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

        // Maximize browser window
        driver.manage().window().maximize();

        // Fill in the form fields
        // Email
        driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("testemail@test.com");

        // Password
        driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Test@1234");

        // Confirm Password
        driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Test@1234");

        // First Name
        driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("TestZee");

        // Last Name
        driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("TestAll");

        // Job Title
        driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Engineer");


        // Input other details (Phone Number)
        driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("+911234567890");

        // Company Name
        driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("XYZ.pvt.ltd");

        // Select a value from a dropdown (Country)
        WebElement countryDropdown = driver.findElement(By.id("sView1:r1:0:country::content"));
        // Country selection
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("India");

        // Address
        driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("India");

        // city
        driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Jaunpur");
        // State
        WebElement statedropDown = driver.findElement(By.id("sView1:r1:0:state::content"));
        Select stateSelect = new Select(statedropDown);
        stateSelect.selectByContainsVisibleText("Uttar Pradesh ");
        // adding zip
        driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("123456");



        // Click the 'Create Account' button
        driver.findElement(By.id("sView1:r1:0:b1")).click();


        // Close the browser
        Thread.sleep(2000);
        driver.quit();
    }

}

