package com.sel.WebDriverAutomation.Assigment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://login.salesforce.com/");

    }
}
