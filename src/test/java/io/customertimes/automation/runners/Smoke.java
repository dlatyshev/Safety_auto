package io.customertimes.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty"},
features = "src/test/resources",
glue = {"io.customertimes.automation.steps" , "io.customertimes.automation.hooks"})
public class Smoke extends AbstractTestNGCucumberTests {
}