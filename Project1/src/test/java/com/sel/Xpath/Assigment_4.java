package com.sel.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assigment_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // Maximize the Window
        driver.manage().window().maximize();
        System.out.println("Window maximized");
        // Find all anchor tags (<a>) on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page: " + links.size());
        driver.close();

    }
}
