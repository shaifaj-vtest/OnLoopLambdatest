
Mobile Device Settings
================================
This document covers settings for
* Mobile Automation on Physical Devices for Native App
* Mobile Automation on Cloud using BrowserStack

Machine Configuration
====================
Configure Windows setup: -
* Java 8 jdk and set up JAVA_HOME environment variable
* Git  / SVN  and set up Git environment variable
* Maven and set up M2_HOME environment variable
* Appium Server: AppiumForWindows.zip from https://bitbucket.org/appium/appium.app/downloads/
* Android sdk and set up ANDROID_HOME environment variable: - Download Android stand-alone SDK Tools (Mandatory) OR Android Studio (optional)
> Please note by default Android studio downloads latest Android Emulated devices


Framework setup steps for connecting to a Physical Device
============================
Connect the physical mobile device

open command prompt or terminal window and enter the below command  
"adb devices"    
The detected device should now be in the list. If the device is still not detected add supported driver e.g Samsung Kies for Samsung phones on your host machine



Appium Server Configuration
============================
* Open Appium Server
* Click On General Settings: -
* Note the server url and port for Appium
* Click On Developer Settings: -
* Select Enabled checkbox
* Start the server by clicking on Play button


Run Native App Tests on Android Emulated Device or Physical Device using .apk file
============================  
Android Native Mobile apps are automated using
1) AndroidHelper.class
2) AndroidObject.class
3) Appium and Android Driver
4) Application under test (.apk file)

Android Driver and Appium configuration in AndroidHelper.class
-------------------------------------------------------------------

Provide Appium Server Details URL and Port in this method

    private static AndroidDriver<WebElement> startAppiumDriver() {
        DesiredCapabilities capabilities = getAppiumDesiredCapabilities();
        try {
            ANDROID_DRIVER = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return ANDROID_DRIVER;
    }

Provide APK or application under test file location and other configuration in this method

    private static DesiredCapabilities getAppiumDesiredCapabilities() {
        File app = new File("D:\\projects\\master_cucumber_testng\\tools\\ContactManager.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.example.android.contactmanager");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, ".ContactManager");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        //capabilities.setCapability("deviceName", "42f7ab1fb7b59fab");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        return capabilities;
    }


Android Page Objects
-------------------------------------------------------------------
Every Mobile Page  class extends "AndroidObject.class" to make use of the AndroidDriver Object and utility functions.

Location: /home/dev/src/automationFramework/src/test/java/com/gk/test/pageobjects/mobile
Directory structure: Group common Page Objects classes in a single directory e.g Login Functionality Classes in Login Directory      
File Conventions:Every Class file ends with Page.class (Homepage.class)

Example:


    public class MobileContactsPage extends AndroidObject {
    
    private By addContactButton = By.name("Add Contact");
    private String contactFormFields = ("android.widget.EditText");
    
    public void clickOnAddContact() {
        getAndroidDriver().findElement(addContactButton).click();
    }

    public List<AndroidElement> getContactFormFields(){
        return getAndroidDriver().findElementsByClassName(contactFormFields);
    }