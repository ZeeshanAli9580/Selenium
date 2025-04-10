package com.sel.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_5 {
    public static void main(String[] args) {
        // TC-1 launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // TC-2 go to Facebook Registration Page
        driver.get("https://www.facebook.com/");
        //maximize the Windows
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.manage().window().maximize();
        //Finding the First name text field
        WebElement firstName = driver.findElement(By.name("firstname"));
        // TC-3 fill First Name Textbox with input
        firstName.sendKeys("Test");
        // TC-4 clear the input from First Name Textbox
        firstName.clear();
        //  TC-5 again fill the First Name Textbox with input
        firstName.sendKeys("Test2");

        //6. TC-6 Get the input from Textbox and display it in Console
        String enteredText = firstName.getDomAttribute("value");

        System.out.println(enteredText);
        //7. TC-6 Close browser
        driver.close();

    }
}
