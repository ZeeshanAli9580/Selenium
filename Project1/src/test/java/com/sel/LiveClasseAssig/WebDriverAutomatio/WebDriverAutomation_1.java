package com.sel.LiveClasseAssig.WebDriverAutomatio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAutomation_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Test URL in Chrome Browser
        driver.get("https://www.google.com/");
        driver.close();
    }
}
