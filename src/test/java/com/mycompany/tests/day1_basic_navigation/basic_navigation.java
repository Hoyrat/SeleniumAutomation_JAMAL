package com.mycompany.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class basic_navigation {

    public static void main(String[] args) throws InterruptedException {

        //we setup webdriver based on the browser that we use
        WebDriverManager.chromedriver().setup();
        WebDriverManager.iedriver().setup();

       //creating object for using selenium driver
        WebDriver driver=new ChromeDriver();

        //open browser
        driver.get("http://amazon.com");

        //fullscreen
        driver.manage().window().fullscreen();


        //get title
        System.out.println(driver.getTitle());


        Thread.sleep(3000);

        driver.close();




    }
}
