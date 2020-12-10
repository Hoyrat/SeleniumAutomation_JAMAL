package com.mycompany.tests.day3_webelement_intro;

        /** open Browser
        go to http://practice.cybertekschool.com/forgot_password
        enter any email
        click on retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
        */


import com.github.javafaker.Faker;
import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

    public static void main(String[] args) throws InterruptedException {

        //open the chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to webpage
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement inputBox=driver.findElement(By.name("email"));

        // enter any email
        Faker faker= new Faker();
        String email=faker.internet().emailAddress();

        //sendKeys--> send keyboard actions to webelement /enters given text
        inputBox.sendKeys(email);


        Thread.sleep(3000);

        WebElement retrievePassword=driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        String actualUrl= driver.getCurrentUrl();

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = "+actualUrl);
            System.out.println("expectedlUrl = "+expectedUrl);
        }

        driver.quit();




    }
}
