package com.mycompany.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://etsy.com");

        String title= driver.getTitle();

        System.out.println("title : "+title);

        String currentUrl=driver.getCurrentUrl();

        System.out.println("Url: "+currentUrl);

        String pageSource= driver.getPageSource();

        System.out.println("source code : "+pageSource);
    }
}
