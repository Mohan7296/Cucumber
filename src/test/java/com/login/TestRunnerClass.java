package com.login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Cucu\\src\\test\\resources\\facebook.feature",
glue="com.steps",
dryRun=false,
monochrome=false)
public class TestRunnerClass {

}
