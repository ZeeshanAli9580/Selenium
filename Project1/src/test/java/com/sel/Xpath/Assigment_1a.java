package com.sel.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_1a {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("maximize the windows");
        //Thread.sleep(10000);
        System.out.println("waiting for 10 seconds");


        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Zuhan");
        driver.findElement(By.name("lastname")).sendKeys("Ali");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("22");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Apr");

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1998");

        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("zuhan@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("JKLuio789");
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();



        System.out.println("Closing the Window");
       // driver.close();


    }
}
