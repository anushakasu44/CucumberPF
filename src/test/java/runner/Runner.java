package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue="com.cucumberFrameworkStepDefinations",
tags= "@e2e",
dryRun=false,
strict=true,//almost strict and dryrun are same

monochrome=true, //fordisplaying on console output in a clear readable format
plugin= {"pretty","html:target/myreport3","json:target/cucumber.json",})
//plugin= {"pretty","html:target/myreport","json:target/cucumber.json","xml:target/cucum.xml"})
//diff types of reporting

public class Runner {

	
}
