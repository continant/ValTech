package common.runners

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features/"),
  glue = Array("common.stepDefs"),
  tags = Array("@suite"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"))
class RunSuite
