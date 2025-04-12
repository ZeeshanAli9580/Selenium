package com.sel.LiveClasseAssig.WebDriverAutomatio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverAutomation_3 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }
}
