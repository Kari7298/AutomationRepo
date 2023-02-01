package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import java.util.List;

public class IframePage extends WebTestBase {

    @FindBy(tagName = "iframe")
   List<WebElement> selectFrame;

    public IframePage(){

        PageFactory.initElements(driver,this);
    }
    public void handleFrame() throws InterruptedException
    {
        Utility.iframeHadle(selectFrame);
       // driver.switchTo().frame(selectFrame);
       // selectFrame.click();
    }
}
