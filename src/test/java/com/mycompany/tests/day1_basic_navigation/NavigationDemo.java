package com.mycompany.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://amazon.com");

        driver.manage().window().fullscreen();

        driver.navigate().to("https://facebook.com");
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.navigate().refresh();


    }
}
