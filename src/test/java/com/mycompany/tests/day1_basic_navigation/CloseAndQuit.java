package com.mycompany.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        Thread.sleep(3000);

        //closing the current tab
        driver.close();

        driver=new ChromeDriver();
        driver.get("https://amazon.com");

        //closing the browser, and clear the memory

        driver.get("https://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(3000);

        driver.quit();



    }
}
