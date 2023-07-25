package org.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\isivaraman\\Downloads\\Expleons_Proj\\src\\test\\resources\\FeatureFiles\\4_Messaging\\new_message.feature",
glue={"org.stepDefinitionFourthModule"})

public class RunnerFile {

}
