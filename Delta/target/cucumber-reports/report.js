$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/DeltaHomePage.feature");
formatter.feature({
  "name": "Delta",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Delta homepage",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "On Delta homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinition.on_Delta_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing travel info",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I hover on travel info",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinition.i_hover_on_travel_info()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy25.click(Unknown Source)\n\tat stepdefinitions.HomePageStepDefinition.i_hover_on_travel_info(HomePageStepDefinition.java:21)\n\tat ✽.I hover on travel info(file:///Users/Fahim/Desktop/Demo/Bootcamp_WeekDays_Selenium_December2019/Delta/src/test/java/feature/DeltaHomePage.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on board experience",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.HomePageStepDefinition.i_click_on_board_experience()"
});
formatter.result({
  "status": "skipped"
});
});