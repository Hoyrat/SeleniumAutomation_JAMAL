package com.mycompany.tests.day3_webelement_intro;

import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

/*
* go to website http://practice.cybertekschool.com/upload
* upload Readme.txt
* click upload
* verify file name is displayed in the next page*/

public class FileUpload {

    //burada TestNG @before @After methodlari kullandik

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @BeforeMethod
            public void setUpMethod(){

        driver=WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
            public void tearDownMethod() throws InterruptedException {
            driver.quit();
    }

    @Test

            public void test1(){

        driver.get("http://practice.cybertekschool.com/upload");
        String relativePath="src\\test\\resources\\Readme.txt";
        System.out.println(projectPath);
        System.out.println(relativePath);
        String filePath=projectPath+"\\"+relativePath;
        System.out.println(filePath);

        //get computer operating system
        System.out.println(System.getProperty("os.name"));
        // upload the file
        driver.findElement(By.name("file")).sendKeys(filePath);
        // clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename=driver.findElement(By.id("uploaded-files")).getText();
        System.out.println(actualFilename);
        //verfy file name is displayed in the next page
        Assert.assertEquals(actualFilename,"Readme.txt", "verify the file name");

    }
}


