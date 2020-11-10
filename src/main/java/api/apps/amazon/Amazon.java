package api.apps.amazon;

import api.Android;
import api.apps.amazon.menu.Menu;
import api.apps.amazon.pageHeader.PageHeader;
import api.interfaces.Application;

import java.util.HashMap;

public class Amazon implements Application {

    public PageHeader pageHeader = new PageHeader();
    public Menu menu = new Menu();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(),activityID());
        return null;
    }

    @Override
    public String packageID() {
        return "org.....android.amazon";
    }

    @Override
    public String activityID() {
        return "com.....amazon.softfacade.MainActivity";
    }

}
