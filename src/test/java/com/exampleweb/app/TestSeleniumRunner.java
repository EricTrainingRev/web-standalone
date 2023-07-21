package com.exampleweb.app;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class TestSeleniumRunner {
    public static WebDriver driver;

    public static void setup(){
        File file = new File("path/to/driver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=path/to/chrome/profile/directory");
        options.addArguments("--profile-directory=profile #"); // add this if your chrome has multiple profiles
        driver = new ChromeDriver(options);
    }
}
