package com.syntax;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizedBrower {
    public static void main(String[]args){
        System.setProperty("WebDriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:amazon.com");
        driver.manage().window().maximize();
    }
}
