package com.sel.BrowserAutomation;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class HDFCBankAutomationB {

        public static void main(String[] args) throws InterruptedException {

            String URL = "https://netbanking.hdfcbank.com/netbanking/";

            // TC-1 launch Firefox browser
            WebDriver driver = new FirefoxDriver();

            // Go to the Test URL "https://netbanking.hdfcbank.com/netbanking/"
            driver.get(URL);

            // TC-3 maximize the browser window
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // TC-4 get the title of page
            String titleOfPage = driver.getTitle();
            System.out.println("Home page title: " + titleOfPage);

            // Switching to frames
            driver.switchTo().frame("login_page");
            System.out.println("Switched to frame");

            // TC-5 click on know more link text
            WebElement knowMoreLink = driver
                    .findElement(By.xpath("//div[@class = 'col-sm-10 rightwrap fr']//div[2]/span/a"));
            knowMoreLink.click();

            // Getting the window handles
            Set<String> windows = driver.getWindowHandles();
            String parentWindow = driver.getWindowHandle();

            String childWindow = null;

            for (String window : windows) {
                if (!window.equals(parentWindow)) {
                    childWindow = window;
                }
            }

            // TC-6 switch from 0th window to 1st window
            driver.switchTo().window(childWindow);
            Thread.sleep(2000);

            // TC-7 after switching get the title of page
            System.out.println("child window title: " + driver.getTitle());

            // TC-8 switch from 1st window to 0th window
            driver.switchTo().window(parentWindow);

            // TC-9 after switching, get the title of page
            System.out.println("Parent Window title: " + driver.getTitle());

            // TC-10 close 0th window
            driver.close();
            System.out.println("Closing the parent window(0th Window)");
        }
    }

