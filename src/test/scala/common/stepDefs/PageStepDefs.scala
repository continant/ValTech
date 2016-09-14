package common.stepDefs

import org.openqa.selenium.By

class PageStepDefs extends RootStepDefs {

  When("""^I click on "(.*?)" link on page$""") { (linkText: String) =>
    driver.findElement(By.linkText(linkText)).click()
  }

  When("""^I click on "(.*?)" partial link on page$""") { (partial: String) =>
    val xpathValue = getXpathByKey(partial)
    Thread.sleep(3000) // because that content becomes visible after some time
    driver.findElement(By.xpath(xpathValue)).click()
  }

  When("""^I click on "(.*?)" clickable on page$""") { (clickable: String) =>
    val id = getIdByKey(clickable)
    driver.findElement(By.id(id)).click()
  }

  Then("""^I should see "([^"]*)" section on page$""") { (xpathKey: String) =>
    val xpathValue = getXpathByKey(xpathKey)
    driver.findElement(By.xpath(xpathValue))
  }

  Then("""^"([^"]*)" is the page header$""") { (header: String) =>
    driver.findElement(By.tagName("h1")).getText should be(header)
  }

  Then("""^I should see "Contact our other offices" contact heading on page$""") { () =>
    Thread.sleep(3000) // because that content becomes visible after some time
    driver.findElement(By.className("contactheader")).getText should be("Contact our other offices")
  }

  Then("""^I should see (\d+) Valtech offices in total$""") { (officeCount: Int) =>
    driver.findElements(By.xpath("""//*[@id="contactbox"]/div/*/ul/li""")).size() should be(officeCount)
  }

  def getXpathByKey(key: String): String = {
    key.toLowerCase match {
      case "latest news" => """//*[@id="container"]/div[2]/div[3]"""
      case "cases" => """//*[@id="navigationMenuWrapper"]/div/div[1]/ul/li[1]/a"""
      case "services" => """//*[@id="navigationMenuWrapper"]/div/div[1]/ul/li[3]/a"""
      case "jobs" => """//*[@id="navigationMenuWrapper"]/div/div[2]/ul/li[1]/a"""
    }
  }

  def getIdByKey(key: String): String = {
    key.toLowerCase match {
      case "navigation menu" => "navigation-toggle-button"
      case "contact icon" => "contacticon"
    }
  }

}
