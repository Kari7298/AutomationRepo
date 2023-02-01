package LenskartProject;

import TestBase.WebTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MouseHoverPage;



public class MouseHoverTest  extends WebTestBase  {
    MouseHoverPage mouseHoverPage;
    public MouseHoverTest(){
            super();
        }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        mouseHoverPage=new MouseHoverPage();
    }
    @Test
    public void mouseHoverMethod(){
        mouseHoverPage.hoverOnMousePage();
    }

}
