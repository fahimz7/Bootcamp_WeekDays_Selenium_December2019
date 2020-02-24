package testhome;

import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    public void getInItElements() {
        PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testJQueryUI() throws InterruptedException {
        xPathClick(buttonWidget);
        sleepFor(3);
    }
}