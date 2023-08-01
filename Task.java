package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String []args){
        System.setProperty("WebDriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:amazon.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title+ " " + url);
        driver.close();
    }
}
