package com.Amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports.html",
        },

        features = "src/test/resources/features",

        glue = "com/Amazon/step_Definitions",

        dryRun =false,

        tags = "@wip-ProductSearch"
)
@RunWith(Cucumber.class)
public class CukesRunner {

}
