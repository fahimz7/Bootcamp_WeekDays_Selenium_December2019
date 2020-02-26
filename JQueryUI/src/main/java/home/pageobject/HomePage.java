package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class HomePage extends WebElementHomePage {

    @FindBy(how = How.XPATH,using = WebElementHomePage.dragAndDrpFrame)
    public static WebElement ClickDragAndDropFrame;

    public static String doDropToInnerFrame(){return dragAndDrpFrame;}


    }
//}