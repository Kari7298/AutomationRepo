package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropDownPage;
public class DropDownTest extends WebTestBase {
   DropDownPage dropDownPage;

    public DropDownTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        dropDownPage=new DropDownPage();
    }
    @Test
    public void verifyDropDownFunction(){
      dropDownPage.clickElement("byVisibleText","New");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
