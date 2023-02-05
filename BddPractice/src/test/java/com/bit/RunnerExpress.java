package com.bit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\u_far\\eclipse-workspace\\BddPractice\\expressLogin.feature"}
,glue= {"com.bit"},dryRun=true)
public class RunnerExpress {

}
