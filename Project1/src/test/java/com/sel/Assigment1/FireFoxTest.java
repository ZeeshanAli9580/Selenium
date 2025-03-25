package com.sel.Assigment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
    }
}
