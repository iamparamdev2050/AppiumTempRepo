import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;


public class DemoTest {

    AppiumDriver<MobileElement> driver;
    String mHost="http://localhost:4723/wd/hub";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test Start>>>>>>>>>>>>>>>>>>>>");


        DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4");
        iosCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestiPhoneX");
        iosCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/BStackSampleApp.ipa");
        iosCapabilities.setCapability("automationName", "XCUITest"); // Automation name for iOS
        driver = new IOSDriver<>(new URL(mHost), iosCapabilities);


////
////        // Create an Android driver using Android desired capabilities
//       DesiredCapabilities androidCapabilities = new DesiredCapabilities();
//        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
//        androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");
//        androidCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/app-debug.apk");
//        androidCapabilities.setCapability("automationName", "UiAutomator2"); // Automation name for Android
//        driver = new AndroidDriver<>(new URL(mHost), androidCapabilities);

    }

    @Test
    public void test_Appium() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Between Test>>>>>>>>>>>>>>>>>>>>");
    }
    @AfterClass
    public void tearDown()    {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test End>>>>>>>>>>>>>>>>>>>>");
        driver.quit();
    }
}
