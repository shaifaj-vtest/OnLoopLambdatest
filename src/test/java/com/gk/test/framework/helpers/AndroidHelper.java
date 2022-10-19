package com.gk.test.framework.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class AndroidHelper extends EventFiringWebDriver {
    static String userName = System.getenv("LT_USERNAME") == null ?
            "ankitagarwal" : System.getenv("LT_USERNAME"); //Add username here
    static String accessKey = System.getenv("LT_ACCESS_KEY") == null ?
            "07P82E8VrqFA4POG56uQSd4zozeW4eHrCtESgDX5ynXNkZbVwd" : System.getenv("LT_ACCESS_KEY"); //Add accessKey here
    public static String gridURL = "@mobile-hub.lambdatest.com/wd/hub";

    static AppiumDriver ANDROID_DRIVER;
    private static final Logger LOG = LoggerFactory
            .getLogger(AndroidHelper.class);
    private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";
    //   private static AppiumDriver ANDROID_DRIVER;
    URL url;
    private static final Thread CLOSE_THREAD = new Thread() {

        @Override
        public void run() {
            ANDROID_DRIVER.quit();
        }
    };

    static {
        Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);
        ANDROID_DRIVER = startAppiumDriver();
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    private AndroidHelper() {
        super(ANDROID_DRIVER);
    }

    public static AndroidDriver<WebElement> startAppiumDriver() {

        DesiredCapabilities capabilities = getAppiumDesiredCapabilities();
        try {
            String hub = "https://" + userName + ":" + accessKey + gridURL;
            ANDROID_DRIVER = new AndroidDriver<>(new URL(hub), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return (AndroidDriver<WebElement>) ANDROID_DRIVER;
    }

    private static DesiredCapabilities getAppiumDesiredCapabilities( ) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build","Java TestNG Android");
        capabilities.setCapability("name","Android"+" "+"Redmi Note 8 Pro"+" "+"11");
        capabilities.setCapability("deviceName", "Redmi Note 8 Pro");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("isRealMobile", true);

       HashMap<String, Object> playstorelogin = new HashMap<String, Object>();
        playstorelogin.put("email", "mayur.rawal@vtestcorp.com");
        playstorelogin.put("password", "Viman@1234");
        capabilities.setCapability("playStoreLogin", playstorelogin);

        capabilities.setCapability("app", "lt://APP10160601531664185159289555"); //Enter your app url
        capabilities.setCapability("deviceOrientation", "PORTRAIT");
        capabilities.setCapability("console", true);
        capabilities.setCapability("visual", true);
        capabilities.setCapability("devicelog", true);
        return capabilities;
    }

    public static AndroidDriver<WebElement> getAndroidWebDriver() {

        return (AndroidDriver<WebElement>) ANDROID_DRIVER;
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException( "You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
        }
        super.close();
    }
}
