package com.sel.Assigment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestFirFoxUrl {
    public static void main(String[] args) {
        WebDriver driver  = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
