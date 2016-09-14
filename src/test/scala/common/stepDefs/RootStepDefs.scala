package common.stepDefs

import common.hooks.WebHooks
import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser

trait RootStepDefs extends ScalaDsl with WebBrowser with EN with Matchers with WebHooks {

}
