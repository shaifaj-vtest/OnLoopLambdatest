package com.gk.test.framework;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ResourceBundle;

import io.appium.java_client.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gk.test.framework.helpers.AndroidHelper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.Getter;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public abstract class AndroidObject {
    private static final long DRIVER_WAIT_TIME = 10;
    private static final Logger LOG = LoggerFactory.getLogger(AndroidObject.class);
    @Getter
    private final ResourceBundle props;
    static @Getter
    protected AndroidDriver androidDriver;


    protected AndroidObject() {
       AndroidObject.androidDriver = AndroidHelper.getAndroidWebDriver();
        this.props = ResourceBundle.getBundle("props/messages");
    }


    public void swipe (double startxd, double startyd, double endxd, double endyd)throws InterruptedException {
//    public void swipe(AppiumDriver<MobileElement> driver, double starxd, double startyd, double endxd, double endyd) {
    Dimension size = androidDriver.manage().window().getSize();
       int startx = (int) (size.width * startxd);
       int starty = (int) (size.height * startyd);
       int endx = (int) (size.width * endxd);
       int endy = (int) (size.height * endyd);

       TouchAction touch = new TouchAction(androidDriver);
       touch.press(point(endx, endy)).waitAction(waitOptions(Duration.ofSeconds(1)))
       .moveTo(point(startx, starty)).release().perform();
       
    
  }
   
    public static void applyWaitForElement(By locator, int time) throws MalformedURLException {
		WebDriverWait wait = new WebDriverWait(androidDriver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
    public void closeApp() {
        ((InteractsWithApps) androidDriver).closeApp();
    }

    public void launchApp() {
        ((InteractsWithApps) androidDriver).launchApp();

    }

      public void scrollTillElement(String name) {
         ((FindsByAndroidUIAutomator) getAndroidDriver())
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".scrollable(true)).scrollIntoView(" + "new UiSelector().descriptionContains(\"" + name + "\"))");
    }
    public void verticalSwipeByPercentages( double startPercentage, double endPercentage,
                                            double anchorPercentage) {
        Dimension size = androidDriver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(androidDriver).press(point(anchor, startPoint)).waitAction(waitOptions(ofMillis(3000)))
                .moveTo(point(anchor, endPoint)).release().perform();
    }

        public void PointerSwipe(int startxd, int startyd, int endxd, int endyd) {
            TouchAction swipe = new TouchAction(androidDriver)
                    .press(PointOption.point(startxd, startyd))
                    .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(endxd, endyd))
                    .release()
                    .perform();
        }


}