package stepdefinitions;

import home.pageobject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testhome.TestHomePage;

public class DeltaStepDefinitions extends HomePage {
    TestHomePage test=new TestHomePage();
    @Given("On Delta homepage")
    public void on_Delta_homepage() {

    }

    @Then("I hover on travel info")
    public void i_hover_on_travel_info() {
        Actions hover = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(webElementOnBoardExperience));
        hover.moveToElement(target).perform();
    }

    @Then("I click on board experience")
    public void i_click_on_board_experience() {
       getClickTravelInfo().click();
    }



}

