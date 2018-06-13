package com.agarsanchez.testingchallengebackend.acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by albertogarciasanchez on 13/6/18.
 */

@CucumberOptions(glue = "com.agarsanchez.testingchallengebackend.acceptance", features = "src/test/resources/features")
@RunWith(Cucumber.class)
public class AcceptanceCriteriaTest {
}
