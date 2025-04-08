package com.sel.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HDFCBankAutomation {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // TC-1: Launch Chrome Browser
        System.out.println("TC-1: Chrome Browser Launched!");

        // TC-2: Open HDFC NetBanking Page
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        System.out.println("TC-2: Opened HDFC NetBanking Page!");

        // TC-3: Maximize the Browser Window
        driver.manage().window().maximize();
        System.out.println("TC-3: Browser Maximized!");

        // TC-4: Get and Print the Title of the Page
        String titleBeforeClick = driver.getTitle();
        System.out.println("TC-4: Title of Page - " + titleBeforeClick);

        // TC-5: Click on "Know More" Link (Inside an iframe)
        driver.switchTo().frame("login_page");
        WebElement knowMoreLink = driver.findElement(By.xpath("//a[contains(text(),'Know More')]"));
        knowMoreLink.click();
        System.out.println("TC-5: Clicked on 'Know More'!");

        // TC-6: Switch from 0th Window to 1st Window
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("TC-6: Switched to New Window!");
                break;
            }
        }

        // TC-7: Get the Title of the New Window
        String titleAfterSwitch = driver.getTitle();
        System.out.println("TC-7: Title of New Window - " + titleAfterSwitch);

        // TC-8: Switch Back to Main Window
        driver.switchTo().window(mainWindow);
        System.out.println("TC-8: Switched Back to Main Window!");

        // TC-9: Get and Print the Title Again
        String titleAfterReturning = driver.getTitle();
        System.out.println("TC-9: Title of Page After Returning - " + titleAfterReturning);

        // TC-10: Close All Windows
        driver.quit();
        System.out.println("TC-10: Closed All Browser Windows!");
    }
}
