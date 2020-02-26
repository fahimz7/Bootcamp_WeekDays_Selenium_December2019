package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomePage extends WebElementHomePage {


    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementOnBoardExperience)
    public static WebElement onBoardExperience;

    public static WebElement getOnBoardExperience() {
        return onBoardExperience;
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementClickTravelInfo)
    public static WebElement clickTravelInfo;

    public static WebElement getClickTravelInfo() {

        return clickTravelInfo;
    }

    public static void doClickOnBoardExperience() {
        Actions hover = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(webElementOnBoardExperience));
        hover.moveToElement(target).perform();

    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchButton)
    public static WebElement clickSearchButton;

    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchBox)
    public static WebElement writeSearchBox;

    public static WebElement getWriteSearchBox() {
        return writeSearchBox;
    }

    public static void doClickSearchButtonAndWrite() throws InterruptedException {
        driver.findElement(By.xpath(webElementSearchButton)).click();
        driver.findElement(By.xpath(webElementSearchBox)).sendKeys("flights", Keys.ENTER);
        sleepFor(3);
        //driver.findElement(By.xpath(webElementSearchBoxButton)).click();
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.flightStatus)
    public static WebElement clickFlightStatus;

    public static WebElement getClickFlightStatus() {
        return clickFlightStatus;
    }

    public static void doClickFlightStatus() throws InterruptedException {
        //driver.findElement(By.xpath(flightStatus)).click();
        getClickFlightStatus().click();
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMiles)
    public static WebElement hoverSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.knowSkyMiles)
    public static WebElement clickKnowSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMilesOptions)
    public static WebElement clickSkyMilesOptions;

    @FindBy(how = How.XPATH, using = WebElementHomePage.howToEarnMiles)
    public static WebElement clickHowToEarnMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.airlinePartners)
    public static WebElement clickAirlinePartners;

    public static WebElement getHoverSkyMiles() {
        return hoverSkyMiles;
    }

    public static WebElement getClickKnowSkyMiles() {
        return clickKnowSkyMiles;
    }

    public static WebElement getClickSkyMilesOptions() {
        return clickSkyMilesOptions;
    }

    public static WebElement getClickHowToEarnMiles() {
        return clickHowToEarnMiles;
    }

    public static WebElement getClickAirlinePartners() {
        return clickAirlinePartners;
    }

    public static void doHoverSkyMiles() throws InterruptedException {
        Actions hover = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(skyMiles));
        hover.moveToElement(target).perform();
        getClickKnowSkyMiles().click();
        Thread.sleep(2000);
        getClickSkyMilesOptions().click();
        Thread.sleep(2000);
        getClickHowToEarnMiles().click();
        Thread.sleep(2000);
        getClickAirlinePartners().click();
    }

    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSearchButton)
    public static WebElement clickDeltaSearchButton;

    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSearchBox)
    public static WebElement typeDeltaSearchBox;

    @FindBy(how = How.XPATH, using = WebElementHomePage.skyMilesCreditCard)
    public static WebElement clickSkyMilesCreditCard;

    @FindBy(how = How.XPATH, using = WebElementHomePage.getToKnowSkyMiles)
    public static WebElement clickGetToKnowSkyMiles;

    @FindBy(how = How.XPATH, using = WebElementHomePage.deltaSkyMilesAmex)
    public static WebElement clickDeltaSkySmilesAmex;

    @FindBy(how = How.XPATH, using = WebElementHomePage.personalCards)
    public static WebElement clickPersonalCards;

    @FindBy(how = How.XPATH, using = WebElementHomePage.blueAmexCard)
    public static WebElement clickBlueAmexCard;

    @FindBy(how = How.XPATH, using = WebElementHomePage.blueAmexRatesAndFees)
    public static WebElement clickBlueAmexRateAndFees;

    @FindBy(how = How.XPATH, using = WebElementHomePage.applyNowBlueAmex)
    public static WebElement clickApplyNowBlueAmex;

    @FindBy(how = How.XPATH, using = WebElementHomePage.enterFirstName)
    public static WebElement writeFirstName;

    @FindBy(how = How.XPATH, using = WebElementHomePage.enterLastName)
    public static WebElement writeLastName;

    @FindBy(how = How.XPATH, using = WebElementHomePage.ExploreMore)
    public static WebElement clickExploreMore;

    @FindBy(how = How.XPATH, using = WebElementHomePage.goldAMexApply)
    public static WebElement clickGoldAmexApply;


    public static WebElement getClickDeltaSearchButton() {
        return clickDeltaSearchButton;
    }

    public static WebElement getTypeDeltaSearchBox() {
        return typeDeltaSearchBox;
    }

    public static WebElement getClickSkyMilesCreditCard() {
        return clickSkyMilesCreditCard;
    }

    public static WebElement getClickGetToKnowSkyMiles() {
        return clickGetToKnowSkyMiles;
    }

    public static WebElement getClickDeltaSkySmilesAmex() {
        return clickDeltaSkySmilesAmex;
    }

    public static WebElement getClickPersonalCards() {
        return clickPersonalCards;
    }

    public static WebElement getClickBlueAmexCard() {
        return clickBlueAmexCard;
    }

    public static WebElement getClickBlueAmexRateAndFees() {
        return clickBlueAmexRateAndFees;
    }

    public static WebElement getClickApplyNowBlueAmex() {
        return clickApplyNowBlueAmex;
    }

    public static WebElement getWriteFirstName() {
        return writeFirstName;
    }

    public static WebElement getWriteLastName() {
        return writeLastName;
    }

    public static WebElement getEmploreMore() {
        return clickExploreMore;
    }

    public static WebElement getClickGoldAmexApply() {
        return clickGoldAmexApply;
    }


    public static void doSearchCreditCards() throws InterruptedException {
        getClickDeltaSearchButton().click();
        getTypeDeltaSearchBox().sendKeys("credit card", Keys.ENTER);
        driver.navigate().back();
        Actions hover = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(skyMiles));
        hover.moveToElement(target).perform();
        getClickSkyMilesCreditCard().click();
        Thread.sleep(2000);
        getClickGetToKnowSkyMiles().click();
        Thread.sleep(2000);
        getClickDeltaSkySmilesAmex().click();
        Thread.sleep(3000);
        getClickPersonalCards().click();
        Thread.sleep(3000);
        getClickBlueAmexCard().click();
        Thread.sleep(3000);
        getClickBlueAmexRateAndFees().click();
        Thread.sleep(3000);
        driver.navigate().back();
        getClickApplyNowBlueAmex().click();
        Thread.sleep(3000);
        getWriteFirstName().sendKeys("Fahim");
        Thread.sleep(3000);
        getWriteLastName().sendKeys("Zaman");
        driver.navigate().to("https://www.delta.com");
        Thread.sleep(3000);
        scrollUpDown(500);
        getEmploreMore().click();
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        getClickGoldAmexApply().click();
        sleepFor(3);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.quit();
    }

}

