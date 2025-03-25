package com.sel.Assigment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestWithUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       // Thread.sleep(5000);
        // Or we can use this as well 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}
