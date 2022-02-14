package com.github.dreamhead.todo.api;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}, features = "src/test/resources")
public class CucumberIntegrationTest extends SpringIntegrationTest {
}
