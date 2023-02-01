package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class GetWindowHandlerPage extends WebTestBase {
    @FindBy(xpath="//i[@class='fa fa-facebook fa-lg text-color-white']")

    WebElement sunglasClick;
    @FindBy(xpath="//button[@class='No thanks']")
    WebElement firstAdvertised;


    public GetWindowHandlerPage() {
        PageFactory.initElements(driver, this);
    }
   /* public  void clickOnSunglass(){
       sunglasClick.click();
    }*/
    public void windowHandler() throws InterruptedException {
        Utility.ScrollDown(driver);
        sunglasClick.click();
        Utility.getWindowHandle(driver);

    }
  /*  public void closedFirstAd(){
        Utility.waitUntilElementClickable(driver,firstAdvertised);
        firstAdvertised.click();
    }*/

}

