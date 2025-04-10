package com.sel.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_1b {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("maximize the windows");
        //Thread.sleep(10000);
        System.out.println("waiting for 10 seconds");


        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        ////Location Day dropdown and selecting 22 date
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropdown);
        day.selectByVisibleText("22");

        //Location month dropdown and selecting April month
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByVisibleText("Apr");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByVisibleText("1998");
        driver.close();




        System.out.println("Closing the Window");
        // driver.close();

    }
    }
