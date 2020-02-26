package testhome;

import home.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestHomePage extends HomePage {
    public void getInItElements() throws InterruptedException {

        PageFactory.initElements(driver, HomePage.class);
 }
//    @Test(priority = 1)
//    public void getInIt()throws InterruptedException{
//        getInItElements();
//        clickOnElement("//a[contains(text(),'Droppable')]");
//        iframeHandle(ClickDragAndDropFrame);
//        dragAndDrop(dragFrom, DroppableToInnerFrame);
//        Thread.sleep(5000);
//    }
//    @Test
//    public void getSelectable() throws InterruptedException {
//        getInItElements();
//        xPathClick(selectable);
//        xPathClick(number4);
////        driver.findElement(By.xpath(number4)).click();
////        driver.findElement(By.xpath(selectable)).click();
//        Thread.sleep(2000);
//
//    }
    @Test
    public void testDatePicker()throws InterruptedException{
        getInItElements();
        driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html[1]/body[1]/p[1]/input[1]")).click();
        Thread.sleep(2000);
//        xPathSendKey(datePicker,"03232020");
//        sleepFor(3);
        List<WebElement> dates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));

        int total_node=dates.size();

        for (int i=0;i<total_node;i++){
            String date=dates.get(i).getText();
            if (date.equalsIgnoreCase("28")){
                dates.get(i).click();
                break;
            }
        }




    }
}