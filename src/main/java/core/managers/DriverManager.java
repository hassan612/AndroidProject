package core.managers;

import api.Android;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class DriverManager {

    private static HashMap<String, URL> hosts;
    private static String unlockPackage = "io.appium.unlock";

    private static DesiredCapabilities getCaps(String deviceID){
        MyLogger.log.info("Creating driver caps for device: "+deviceID);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceID);
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "path to appium unlock apk file");
        return caps;
    }

    private static URL hosts(String deviceID) throws MalformedURLException{
        if (hosts == null){
            hosts = new HashMap<>();
            hosts.put("ZX1G456HF", new URL("http://126.0.0:4723/wd/hub"));
//            Add more devices IDs for other devices and change each server url if you want to rum parallel testing
//            hosts.put("ZX1G456HF", new URL("http://126.0.2:4724wd/hub"));
//            hosts.put("ZX1G456HF", new URL("http://126.0.3:4725/wd/hub"));
        }return hosts.get(deviceID);
    }

    private static ArrayList<String> getAvailableDevices(){
        MyLogger.log.info("Checking for available devices");
        ArrayList<String> availableDevices = new ArrayList<>();
        ArrayList connectedDevices = ADB.getConnectedDevices();
        for (Object connectedDevice: connectedDevices){
            String device = connectedDevice.toString();
            ArrayList apps = new ADB(device).getInstalledPackages();
            if (!apps.contains(unlockPackage)) availableDevices.add(device);
            else MyLogger.log.info("Device "+device+" has "+unlockPackage+" installed assuming it is under testing");
        }
        if (availableDevices.size() == 0) throw new RuntimeException("There isn't a single device available for testing at this time");
        return availableDevices;
    }

    public static void createDriver() throws MalformedURLException {
        ArrayList<String> devices = getAvailableDevices();
        for (String device: devices){
            try {
                MyLogger.log.info("Creating new Driver for device "+device);
                Android.driver = new AndroidDriver(hosts(device), getCaps(device));
                Android.adb = new ADB(device);
                break;
            } catch (MalformedURLException e) {
                //Ignore and try next device
                e.printStackTrace();
            }
        }
    }

    public static void killDriver(){
        if (Android.driver != null){
            MyLogger.log.info("Killing Android Driver");
            Android.driver.quit();
            Android.adb.uninstallApp(unlockPackage);
        }else MyLogger.log.info(" Android Driver is not initialized, nothing to kill!");
    }

}
