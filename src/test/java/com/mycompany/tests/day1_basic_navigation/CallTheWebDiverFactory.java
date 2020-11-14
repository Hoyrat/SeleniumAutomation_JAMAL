package com.mycompany.tests.day1_basic_navigation;

import com.mycompany.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheWebDiverFactory {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://google.com");
    }
}
