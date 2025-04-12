package com.sel.LiveClasseAssig.WebDriverAutomatio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverAutomation_2 {
    public static void main(String[] args) {
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }
}
