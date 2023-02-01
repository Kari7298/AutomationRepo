package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckBoxPage;


public class CheckBoxTest extends WebTestBase {
    CheckBoxPage checkBoxPage;
  public   CheckBoxTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
         checkBoxPage=new CheckBoxPage();
    }
    @Test
    public void verifyCheckbox(){
     checkBoxPage.clickComputerGlasses();
     checkBoxPage.scrollDown();
      checkBoxPage.isSelectMethod();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
