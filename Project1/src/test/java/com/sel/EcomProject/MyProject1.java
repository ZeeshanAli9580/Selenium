package com.sel.EcomProject;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class MyProject1 {


    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='q8WwEU']/div[@class='_3zsGrb']/div[@class='_2-LWwB']/div/div[@class='css-175oi2r']/div[@class='css-175oi2r']/div[@class='css-175oi2r r-13awgt0 r-1iqfa7g r-60vfwk']/div[@class='css-175oi2r r-13awgt0 r-1iqfa7g r-60vfwk']/div[@class='_1ui5b4']/div[@class='_2nl6Ch']/div[@class='_2NhoPJ']/header[@class='_3EOQ5Q']/div[@class='_2msBFL']/div[2]/div[1]/div[1]/div[1]")).click();
        //WebElement electronics = driver.findElement(By.xpath("//span[@class='TSD49J nEqBzi']"));
        // Actions action = new Actions(driver);
        //action.clickAndHold(electronics).build().perform();
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Mobiles");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Phones");
        int rowNum = 1;

        List<WebElement> name = List.of();
        List<WebElement> price = List.of();

        Row row = null;

        for(WebElement product :products) {
            name = product.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
            price = product.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

        }
        for(int i=0;i<name.size();i++) {
            String item = name.get(i).getText();
            String pp = price.get(i).getText();

            row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(item);
            row.createCell(1).setCellValue(pp);

            System.out.println(item + " - "+pp);
        }

        FileOutputStream os = new FileOutputStream("Phones.xlsx");
        workbook.write(os);


        driver.close();
    }

}
