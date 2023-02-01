package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class MouseHoverPage extends WebTestBase {
    @FindBy(xpath="//a[text()='CONTACT LENSES']")
    WebElement clickLenses;

    public MouseHoverPage() {
        PageFactory.initElements(driver, this);
    }
    public void hoverOnMousePage(){
        Utility.mouseHoverMethod(driver,clickLenses);
    }
}
