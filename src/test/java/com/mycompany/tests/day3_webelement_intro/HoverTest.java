package com.mycompany.tests.day3_webelement_intro;

import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void  test1(){

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img=driver.findElement(By.tagName("img"));

        Actions actions=new Actions(driver);

        actions.moveToElement(img).perform();

        WebElement text=driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text.isDisplayed());

    }

    // hoverover each image in the website
    //verify each name user text is displayed
    @Test
    public void  test2(){
        //first we can it with  do for loop

        driver.get("http://practice.cybertekschool.com/hovers");

        for(int i=1;i<4;i++){

            String imageXpat="(//img)["+i+"]";

            System.out.println(imageXpat);

            WebElement img=driver.findElement(By.xpath(imageXpat));

            Actions actions=new Actions(driver);// creating actions class object

            actions.moveToElement(img).perform();

            String textXpat="//h5[.='name: user"+i+"']";//creating dynamic xpath for the text

            WebElement text=driver.findElement(By.xpath(textXpat));//passing xpath to webelement

            System.out.println(text.getText());

           Assert.assertTrue(text.isDisplayed());//verifying text is displayed

        }

    }
}
