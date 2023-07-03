package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.NotificationApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}
