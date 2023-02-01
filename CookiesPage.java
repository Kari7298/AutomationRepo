package pages;

import TestBase.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class CookiesPage extends WebTestBase {
    public CookiesPage(){ PageFactory.initElements(driver,this);}
    public void getcookiesMethod(){
        Utility.fetchingCookies(driver);
    }
    public void addcookiesMethod(String key, String value)
    {
        Utility.addCokkies(driver,key,value);
    }
}
