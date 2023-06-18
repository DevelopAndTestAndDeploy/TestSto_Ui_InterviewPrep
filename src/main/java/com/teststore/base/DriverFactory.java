package com.teststore.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());

        }
        return webDriver.get();
    }

    private static WebDriver createDriver() {
        WebDriver driver = null;

        switch (getBrowserType()) {
            case "chrome" :
                driver = new ChromeDriver();
                break;



            case "firefox" :
//                driver = new FirefoxDriver();
//                break;
                //WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;


        }

        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType()  {
        String browserType = null;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir")
                    + "/src/main/java/com/teststore/properties/Config.properties");
            properties.load(file);
            browserType = properties.getProperty("browser").toLowerCase().trim();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        return browserType;
    }

    public static void cleanUpDriver() {

        webDriver.get().quit();
        webDriver.remove();
    }

}
