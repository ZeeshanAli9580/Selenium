package com.sel.EcomProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        Scanner sc = new Scanner(System.in);
        String otp = sc.next();
        driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div[2]/div[2]/a")).click();
    }
}
