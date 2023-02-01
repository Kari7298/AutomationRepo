package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void waitUntilElementClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void selectvalue(WebElement element, String value1, String value2) {
        Select dropDown = new Select(element);
        if (value1.equalsIgnoreCase("byvalue")) {
            dropDown.selectByValue(value2);
        } else if (value1.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value2));
        } else if (value1.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value2);
        } else {
            System.out.println("please select the correct value");
        }
    }

    public static void getWindowHandle(WebDriver driver) throws InterruptedException {
        String parentWindowID = driver.getWindowHandle();
        Set<String> Window = driver.getWindowHandles();
        for (String w : Window) {
            if (!parentWindowID.contentEquals(w)) {
                driver.switchTo().window(w);
            }
            Thread.sleep(4000);
        }
    }

    public static void alertMethod(WebDriver driver) throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

    }

    public static void iframeHadle(List<WebElement> element) throws InterruptedException

    {
        System.out.println(element.size());
        for(WebElement e : element){
            System.out.println(e);
        }
    }



    public static void ScrollDown(WebDriver driver){
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,800)");
        je.executeScript("window.scrollBy(0,-200)");
    }
    public static void mouseHoverMethod(WebDriver driver,WebElement element)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(element)
                .click(element)
                .build()
                .perform();
    }

public  static void fetchingCookies(WebDriver driver){
        System.out.println("-----------------getCookies-------------------");
        Set<Cookie> cookies = driver.manage().getCookies();
        for(Cookie c:cookies){
            System.out.println(c);
        }
}
public static void addCokkies(WebDriver driver, String key, String value){
        Cookie addcookie = new Cookie(key,value);
        driver.manage().addCookie(addcookie);

        System.out.println("-------------------AddCookies----------------");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for(Cookie c:cookies1){
            System.out.println(c);
        }
        System.out.println("---------------DeleteCookies-----------------");
        driver.manage().deleteCookie(addcookie);
        Set<Cookie> cookies2 = driver.manage().getCookies();
        for(Cookie c:cookies2){
            System.out.println(c);
        }
}


}
