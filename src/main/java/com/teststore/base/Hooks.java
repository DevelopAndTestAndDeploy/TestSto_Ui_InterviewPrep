package com.teststore.base;

import io.cucumber.java.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.teststore.base.DriverFactory.cleanUpDriver;
import static com.teststore.base.DriverFactory.getDriver;

public class Hooks {

    public Hooks() throws IOException {
        super();
    }

    @BeforeTest
    public void setUP() throws IOException {
        getDriver();
    }

    @AfterTest
    public void tearDown() {
        cleanUpDriver();
    }

}
