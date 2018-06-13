package com.agarsanchez.testingchallengebackend.acceptance;

import com.agarsanchez.testingchallengebackend.TestingChallengeBackendApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TestingChallengeBackendApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@ContextConfiguration
public class AcceptanceCriteriaTestConfig {

}
