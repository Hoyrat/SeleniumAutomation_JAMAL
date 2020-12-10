package com.mycompany.tests.day3_webelement_intro;

import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/*
* go to website http://practice.cybertekschool.com/upload
* upload Readme.txt
* click upload
* verify file name is displayed in the next page*/

public class FileUpload {

    //burada TestNG @before @After methodlari kullandik

    WebDriver driver;

    @BeforeMethod
            public void setUpMethod(){

        driver=WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
            public void tearDownMethod() throws InterruptedException {

        Thread.sleep(10);

        driver.quit();
    }

    @Test

            public void test1(){

        driver.get("http://practice.cybertekschool.com/upload");
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\yspos\\OneDrive\\Desktop\\Readme.txt");

        driver.findElement(By.id("file-submit")).click();

        String actualFilename=driver.findElement(By.id("uploaded-files")).getText();

        System.out.println(actualFilename);

        Assert.assertEquals(actualFilename,"Readme.txt", "verify the file name");

    }



    }


