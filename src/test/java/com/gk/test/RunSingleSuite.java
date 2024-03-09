package com.vs.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "target/test-classes", monochrome = true, tags = "@findWord", plugin = {
        "pretty", "html:target/cucumber-report/single",
        "json:target/cucumber-report/single/cucumber.json",
        "rerun:target/cucumber-report/single/rerun.txt"},
        glue = "com.vs.test")
public class RunSingleSuite extends AbstractTestNGCucumberTests {
}
