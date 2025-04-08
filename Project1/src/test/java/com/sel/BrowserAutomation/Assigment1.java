package com.sel.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1 {
    public static void main(String[] args) throws InterruptedException {
        //1. TC-1 launch Chrome browser
        WebDriver driver = new ChromeDriver();
       // 2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        //
        Thread.sleep(5000);
        //3. TC-3 maximize the browser window
        driver.manage().window().maximize();
        //4. TC-4 get the title of page
        System.out.println("Title of the page is : "+driver.getTitle());
        //5. TC-5 click on know more link text
       // driver.findElement(By.xpath("//a[contains(text(),'Know More')]")).click();
        driver.findElement(By.xpath("//div[@class = 'col-sm-10 rightwrap fr']//div[2]/span/a")).click();
        //driver.findElement(By.partialLinkText("Forgot Customer ID")).click();
        // WebElement knowMoreLink = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
        //knowMoreLink.click();
        //knowMoreButton.click();
        //6. TC-6 switch from 0th window to 1st window

        //8. TC-8 switch from 1st window to 0th window

        //9. TC-9 after switching, get the title of page

        //10. TC-10 close all windows of the browser



    }
}
