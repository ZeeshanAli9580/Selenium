package com.sel.LiveClasseAssig.Synchnization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Assignement_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Scanner scanner = new Scanner(System.in);
        try {

            driver.get("https://smallpdf.com/word-to-pdf");
            Thread.sleep(4000);
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.xpath("//*[text()='Choose Files']"));
            element.click();
            System.out.println("Please provide your file path");
            String filePath = scanner.next();

            element.sendKeys(filePath);
            System.out.println("FIle uploaded succesfully");


            Thread.sleep(4000);
        }
        catch (Exception exception)
        {
            System.out.println(exception.fillInStackTrace());
        }
        finally {
            //driver.close();
            System.out.println("Done !!");
        }
    }
}
