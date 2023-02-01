package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.IframePage;

public class IframeTest extends WebTestBase {

    IframePage iframePage;
   public IframeTest(){
       super();
   }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        iframePage=new IframePage();
    }
    @Test
    public void frameHandle()throws InterruptedException
    {
        iframePage.handleFrame();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
