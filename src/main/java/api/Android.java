package api;

import api.apps.Apps;
import core.managers.ADB;
import io.appium.java_client.android.AndroidDriver;

public class Android {

    public static AndroidDriver driver;
    public static ADB adb;
    public static Apps app = new Apps();
}
