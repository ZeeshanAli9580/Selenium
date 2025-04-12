package com.sel.LiveClasseAssig.XpathElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("maximize the windows");
        //Thread.sleep(10000);
        System.out.println("waiting for 10 seconds");


        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tests");

        // Day selection
        WebElement dayElement = driver.findElement(By.xpath("//*[@name='birthday_day']"));
        Select day = new Select(dayElement);
        day.selectByContainsVisibleText("9");
        // Month selection
        WebElement monthElement = driver.findElement(By.xpath("//*[@name='birthday_month']"));
        Select month = new Select(monthElement);
        month.selectByContainsVisibleText("Nov");
        WebElement yearElement = driver.findElement(By.xpath("//*[@name='birthday_year']"));
        Select year = new Select(yearElement);
        year.selectByContainsVisibleText("1993");
        // Year selection
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("JKLuio789");
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();


        System.out.println("Closing the Window");
        Thread.sleep(4000);
        driver.close();

    }
}
