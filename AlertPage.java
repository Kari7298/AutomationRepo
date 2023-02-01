package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class AlertPage extends WebTestBase {
    @FindBy(xpath = "//span[text()='STORE LOCATOR']")
    WebElement click1;

    @FindBy(xpath = "//button[text()='Locate a store ']")
    WebElement click2;

    @FindBy(id = "passingID")
    WebElement click3;

    @FindBy(xpath = "//input[@class='btn submitBtnLead']")
    WebElement click4;

    public AlertPage() throws InterruptedException {

        PageFactory.initElements(driver, this);
    }

    public void clickOn() {
        click1.click();
        click2.click();
        click3.click();
        click4.click();

    }

    public void alertPage() throws InterruptedException {
        Utility.alertMethod(driver);


    }
}