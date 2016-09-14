package common.stepDefs

class NavigationStepDefs extends RootStepDefs {

  Given("""^I visit "(.*?)" url$""") { (URL: String) =>
    go to URL
  }
  Then("""^I am on "(.*?)" page$""") { (title: String) =>
    driver.getTitle should be(title)
  }

  Then( """^I click back on browser$""") { () =>
    driver.navigate().back()
    driver.navigate().refresh()
  }

}
