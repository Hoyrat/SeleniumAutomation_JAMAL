package com.mycompany.tests.day3_webelement_intro;

import com.github.javafaker.Faker;
import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    /**Verify confirmation message
     * open browser
     * got to http://practice.cybertekschool.com/forgot_password
     * links to an external site
     * enter any email
     * verify that email is displayed in the input box
     * click on retrieve password
     * verify that confirmation message says "your email's been sent"
     *
     */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");



        WebElement emailInputBox=driver.findElement(By.name("email"));

        String expectedEmail="test@gmail.com";

        emailInputBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //getting text from webelements 1. getText() 2. getAttribute("value")
        //from inputBox we use getAttribute()
        String actualEmail=emailInputBox.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
            System.out.println(actualEmail);
        }else{
            System.out.println("FAIL");
            System.out.println("actualEmail = "+actualEmail);
            System.out.println("expectedEmail = "+expectedEmail);

            }
        WebElement retirievePassword=driver.findElement(By.id("form_submit"));

        retirievePassword.click();

        //verify that confirmation message
        String expectedMessage="Your e-mail's been sent!";

        WebElement messageElement=driver.findElement(By.name("confirmation_message"));

        String actualMessage=messageElement.getText();

        System.out.println(actualMessage);

        if(expectedMessage.equals(actualMessage)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }



        driver.quit();


    }


}
