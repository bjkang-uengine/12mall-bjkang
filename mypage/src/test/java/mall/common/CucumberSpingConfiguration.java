package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.MypageApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MypageApplication.class })
public class CucumberSpingConfiguration {}
