package com.sel.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2_b {


    public static void main(String[] args) throws InterruptedException {
        // Set system property for ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver for Chrome
        WebDriver driver = new FirefoxDriver();


        // Open Oracle Registration page
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

        // Maximize browser window
        driver.manage().window().maximize();


        // Select a value from a dropdown (Country)
        // Country selection
        WebElement countryDropdown = driver.findElement(By.id("sView1:r1:0:country::content"));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("India");


        // city
        driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Jaunpur");

        // State
        WebElement statedropDown = driver.findElement(By.id("sView1:r1:0:state::content"));
        Select stateSelect = new Select(statedropDown);
        stateSelect.selectByContainsVisibleText("Uttar Pradesh ");

        // adding zip
        driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("123456");



        // Close the browser
        Thread.sleep(2000);
        //driver.quit();
    }

}

