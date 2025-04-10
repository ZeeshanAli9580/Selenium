package com.sel.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("maximize the windows");
        //Thread.sleep(10000);
        System.out.println("waiting for 10 seconds");


        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Test");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Test");

        Select day = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[1]")));
        day.selectByVisibleText("22");

        Select month = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[2]")));
        month.selectByVisibleText("Apr");

        Select year = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[3]")));
        year.selectByVisibleText("1998");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div/div[1]/input")).sendKeys("Test123");
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();



        System.out.println("Closing the Window");
         driver.close();


    }
}
