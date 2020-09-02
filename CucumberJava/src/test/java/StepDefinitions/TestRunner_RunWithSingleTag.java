package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/FeaturesWithTags",
glue={"StepDefinitions"},
tags= "@smoke or @regression"

		)
public class TestRunner_RunWithSingleTag {

}
