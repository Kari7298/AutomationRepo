package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Utility;


public class HomePage extends WebTestBase {
    @FindBy(xpath="//button[@class='No thanks']")
    WebElement firstAdvertised;
    @FindBy(xpath="//input[@class='search_input-bar autoSuggest']")

    WebElement searchClick;

    @FindBy(xpath="//a[text()='CONTACT LENSES']")
    WebElement textClick;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closedFirstAd(){
        Utility.waitUntilElementClickable(driver,firstAdvertised);
        firstAdvertised.click();
    }

    public void searchClick(String name){
        searchClick.sendKeys(name);
        searchClick.click();
        textClick.click();
    }

}
