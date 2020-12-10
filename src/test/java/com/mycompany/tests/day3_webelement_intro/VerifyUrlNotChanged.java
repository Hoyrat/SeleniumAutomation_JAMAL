package com.mycompany.tests.day3_webelement_intro;

import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChanged {

    /** Verify URL not changed
     * open browser
     * got to http://practice.cybertekschool.com/forgot_password
     * click on retrieve password
     * verify that url did not change
     */


    public static void main(String[] args) {

        //open browser, opens empty chrome

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        //open website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //maximize the window
        driver.manage().window().maximize();

        //Save url to string variable
        String expectedUrl=driver.getCurrentUrl();

        //click on retrieve password

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //save actual url
        String actualUrl=driver.getCurrentUrl();

        //verify that url is not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

       //close the browser
        driver.quit();


    }
}
