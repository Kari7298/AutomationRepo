package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CookiesPage;
import pages.DropDownPage;
import pages.GetWindowHandlerPage;
import pages.HomePage;

public class HomeTest extends WebTestBase {
    HomePage homepage;
    DropDownPage dropDownPage;
    GetWindowHandlerPage getWindowHandlerPage;
    CookiesPage cookiesPage;
    public HomeTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod () {
        initialization();
        homepage = new HomePage();
        dropDownPage=new DropDownPage();
        getWindowHandlerPage=new GetWindowHandlerPage();
        cookiesPage = new CookiesPage();
    }
    @Test
    public void verifySearchFunction () {
        SoftAssert softassert = new SoftAssert();
        homepage.closedFirstAd();
        homepage.searchClick(prop.getProperty("name"));
        softassert.assertAll();
    }
    @Test
    public void verifyDropDownFunction(){

        dropDownPage.clickElement("byVisibleText","New");
    }
    @Test
    public void verifyGetWindowHandlerFunction() throws InterruptedException {

        getWindowHandlerPage.windowHandler();
    }
   @Test
    public void verifyCookiesFunction(){
        cookiesPage.getcookiesMethod();
        cookiesPage.addcookiesMethod("Facebook","Here is Customize Cookies.....");
    }
    @AfterMethod
    public void afterMethod () {
        driver.close();
    }
}
