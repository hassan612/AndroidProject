package Tests;

import api.Android;
import api.apps.amazon.Amazon;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Navigation extends TestManager {

    private static Amazon amazon = Android.app.amazon;

    @BeforeClass
    public static void beforeClass(){
        amazon.open();
    }

    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1(){
        testInfo.id("test1").name("Verify Menu has all the elements");
        Assert.assertTrue(amazon.pageHeader.uiObject.alexaList().exists());
        Assert.assertTrue(amazon.pageHeader.uiObject.wholeFood().exists());
        Assert.assertTrue(amazon.pageHeader.uiObject.fresh().exists());
        Assert.assertTrue(amazon.pageHeader.uiObject.prime().exists());
        Assert.assertTrue(amazon.pageHeader.uiObject.video().exists());
        Assert.assertTrue(amazon.pageHeader.uiObject.music().exists());
    }

}
