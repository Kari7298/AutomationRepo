package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;


public class DropDownPage extends WebTestBase {

    @FindBy(xpath="//a[text()='COMPUTER GLASSES']")
    WebElement textClick;
    @FindBy(xpath = "//select[@class='select-lk']")
    WebElement dropdown;


    public DropDownPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickElement(String value1, String value2){
        textClick.click();
        dropdown.click();
        Utility.selectvalue(dropdown,value1,value2);
    }
}
