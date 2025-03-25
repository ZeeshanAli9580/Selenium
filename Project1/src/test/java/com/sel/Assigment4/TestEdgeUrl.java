package com.sel.Assigment4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class TestEdgeUrl {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
