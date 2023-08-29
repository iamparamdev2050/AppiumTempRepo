
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;


public class DemoTest {

    WebDriver driver;
    String mHost="http://localhost:4723";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test Start>>>>>>>>>>>>>>>>>>>>");


        DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4");
        iosCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestiPhoneX");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set .app file>>>>>>>>>>>>>>>>>>>>");
        iosCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/SampleiOS.app");
        iosCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set iosCapabilities >>>>>>>>>>>>>>>>>>>>");
        driver= new IOSDriver(new URL(mHost), iosCapabilities);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set iosCapabilities Done >>>>>>>>>>>>>>>>>>>>");

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
