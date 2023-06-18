package com.teststore.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"com/teststore/stepDefinitions"}, monochrome=true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class MainRunner extends AbstractTestNGCucumberTests {



}

