package com.github.sylhare.jchess;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:./cucumber/default-cucumber-report/html",
                            "json:./cucumber/cucumber-report.json",
                            "pretty:./cucumber/default-cucumber-report/cucumber-pretty.txt",
                            "usage:./cucumber/default-cucumber-report/cucumber-usage.json",
                            "junit:./cucumber/default-cucumber-report/cucumber-results.xml" },
                features = { "./src/acceptance/resources/features/" })

public class TestRunner {
}
