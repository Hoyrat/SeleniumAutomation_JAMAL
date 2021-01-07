package com.mycompany.tests.day3_webelement_intro;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Digiturk {

    public static void main(String[] args) throws InterruptedException {

        //open browser, opens empty chrome

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //open website
        driver.get("https://temp-mail.org/de/");

        //maximize the window
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement getMail=driver.findElement(By.xpath("//*[@id=\"mail\"]"));
        String tempEmail=getMail.getAttribute("value");
        System.out.println(tempEmail);

        driver.get("https://www.digiturkplay.com/kullanici/giris?r=%2Fcanli-tv");
        Thread.sleep(5000);

        WebElement inputBox= driver.findElement(By.xpath("//*[@id=\"form-login-quickregister\"]/div[1]/div[1]/div/input"));

        inputBox.sendKeys(tempEmail);

        Thread.sleep(5000);

        WebElement kayitOl=driver.findElement(By.xpath("//*[@id=\"form-login-quickregister\"]/button"));

        kayitOl.click();

        Thread.sleep(2000);

        WebElement ad=driver.findElement(By.xpath("//*[@id=\"Name\"]"));

        ad.sendKeys("Tom");

        WebElement soyAd=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));

        soyAd.sendKeys("Tailor");

        WebElement sifre=driver.findElement(By.xpath("//*[@id=\"Password\"]"));

        sifre.sendKeys("hh123456");

        WebElement sifre2=driver.findElement(By.xpath("//*[@id=\"PasswordRe\"]"));

        sifre2.sendKeys("hh123456");

        WebElement uyeOl=driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[2]/button"));

        uyeOl.click();

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,250)");

        jse.executeScript("window.scrollBy(0,250)");

        WebElement digiturLink=driver.findElement(By.linkText("Üyelik Aktivasyonu"));

        Thread.sleep(2000);

        digiturLink.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"tm-body\"]/main/div[1]/div/div[3]/div[2]/div/div[1]/div/div[2]/div[3]/table[2]/tbody/tr[1]/td/table/tbody/tr[3]/td/div[2]/a")).click();

    }

}
