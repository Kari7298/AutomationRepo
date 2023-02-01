package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class CheckBoxPage extends WebTestBase {
    @FindBy(xpath="//a[text()='COMPUTER GLASSES']")
    WebElement  clickOnComputerGlasses;

    @FindBy(xpath="//input[@type='checkbox']")
    WebElement  selectCheckBox;

    public CheckBoxPage(){
        PageFactory.initElements(driver,this);
    }

    public void  clickComputerGlasses(){
        clickOnComputerGlasses.click();

    }
    public void scrollDown(){
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,500)");
    }
    public void isSelectMethod(){
     //   selectCheckBox.click();
        System.out.println(selectCheckBox.isSelected());
    }

}
