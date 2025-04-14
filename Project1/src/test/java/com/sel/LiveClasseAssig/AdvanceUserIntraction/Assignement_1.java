package com.sel.LiveClasseAssig.AdvanceUserIntraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignement_1 {
    public static void main(String[] args) {


        // Step 1: Launch Chrome browser

        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Open test URL - https://www.flipkart.com/
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            System.out.println("Flipkart website launched.");

            // Step 3: Close any screen hiding the actual page (e.g., login popup)
            try {
                WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
                closeButton.click();
                System.out.println("Popup screen closed.");
            } catch (Exception e) {
                System.out.println("No popup screen found.");
            }

           // Women section is not present

            // Step 5: Click on "Shoes"
            WebElement shoesOption = driver.findElement(By.xpath("//a[contains(text(),'Shoes')]"));
            shoesOption.click();
            System.out.println("Clicked on 'Shoes' under 'Women' section.");

            // Step 6: Close browser
        } finally {
           // driver.quit();
            System.out.println("Browser closed.");
        }
    }

}


