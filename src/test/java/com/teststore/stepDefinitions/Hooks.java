package com.teststore.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.teststore.base.DriverFactory.cleanUpDriver;
import static com.teststore.base.DriverFactory.getDriver;

public class Hooks {

    public Hooks() throws IOException {
        super();
    }





    @Before
    public static void setUP() throws IOException {
        getDriver();
    }

    @After
    public static void tearDown() {
        
        cleanUpDriver();
    }

}
