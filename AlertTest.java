package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertPage;


public class AlertTest extends WebTestBase {
    AlertPage alertPage;
    public AlertTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        initialization();
        alertPage=new AlertPage();
    }
    @Test
    public void alertMethod(){
        alertPage.clickOn();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
