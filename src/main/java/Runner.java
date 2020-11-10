import Tests.TestPrimer;
import api.Android;
import api.apps.amazon.pageHeader.PageHeader;
import core.managers.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {

    public static void main (String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.DEBUG);
        AndroidDriver driver = null;

        MyLogger.log.setLevel(Level.DEBUG);

        try {
            DriverManager.createDriver();
            JUnitCore.runClasses(TestPrimer.class);

        } finally {
            DriverManager.killDriver();
        }
    }
}
