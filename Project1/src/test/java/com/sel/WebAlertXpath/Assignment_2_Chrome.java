package com.sel.WebAlertXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Assignment_2_Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the email or phone number");
        String username = scanner.next();
        System.out.println("Please Enter your password");
        String pswd = scanner.next();
        // Lunching the facebook login page
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //enter the email address
        WebElement emailOrPhone =  driver.findElement(By.xpath("//input[@id='email']"));//.sendKeys("Test@example.com");
        emailOrPhone.sendKeys(username);
        //Entering the password
       WebElement userpass = driver.findElement(By.xpath("//input[@id='pass']"));//.sendKeys("Jkluio789");
        userpass.sendKeys(pswd);

        // clicking the login button
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(4000);
        driver.close();
    }
}
