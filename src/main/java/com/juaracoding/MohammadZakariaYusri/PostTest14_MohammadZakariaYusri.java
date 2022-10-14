package com.juaracoding.MohammadZakariaYusri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTest14_MohammadZakariaYusri {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");

        //WebDriverManager.chromedriver().setup();

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);
        int detik = 1;

        delay(detik);
        String tittlename = driver.getTitle();
        System.out.println(tittlename);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //input data keyboard
        driver.findElement(By.id("first-name")).sendKeys("Mohammad Zakaria ");
        System.out.println("input first name");
        delay(detik);
        driver.findElement(By.id("last-name")).sendKeys("Yusri");
        System.out.println("input last name");
        delay(detik);
        driver.findElement(By.id("job-title")).sendKeys("Fresh Graduate");
        System.out.println("input job title");
        delay(detik);

        //input radio button
        delay(detik);
        driver.findElement(By.xpath("//*[@id=\"radio-button-1\"]")).click();
        System.out.println("Yes High School Clicked");
        delay(detik);
        driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]")).click();
        System.out.println("Yes college Clicked");
        delay(detik);
        driver.findElement(By.xpath("//*[@id=\"radio-button-3\"]")).click();
        System.out.println("Yes Grad School Clicked");
        delay(detik);

        //input check box
        delay(detik);
        driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
        System.out.println("Male Clicked");
        delay(detik);

        //select year of experience
        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select selectmenu = new Select(elementSelect);
        delay(detik);
        selectmenu.selectByValue("1");
        delay(detik);

        //scroll vertical 1000 pixel
        delay(detik);
        js.executeScript("window.scrollBy(0,1000)");
        delay(detik);

        //select kalender
        WebElement sendate = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        delay(detik);
        // method pilih kalender
        sendate.sendKeys("11/10/2022");
        delay(detik);
        System.out.println("Date 11-Oktober-2022");

        //Klik button submit
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        delay(detik);
        System.out.println("Button Submit clicked");


        driver.quit();
    }

    // waktu delay
    static void delay ( int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}