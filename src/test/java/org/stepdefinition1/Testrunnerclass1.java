package org.stepdefinition1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= "org.stepdefinition1",monochrome=true,dryRun = true)
public class Testrunnerclass1 {


}
