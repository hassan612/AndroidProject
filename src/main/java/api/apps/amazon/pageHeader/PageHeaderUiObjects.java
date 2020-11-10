package api.apps.amazon.pageHeader;

import core.managers.UiObject;
import core.managers.UiSelector;

public class PageHeaderUiObjects {
    private static UiObject wholeFood,
            fresh,
            alexaList,
            prime,
            video,
            music;

    public UiObject wholeFood(){
        if (wholeFood == null) wholeFood = new UiSelector().text("").makeUiObject();
        return wholeFood;
    }

    public UiObject fresh(){
        if (fresh == null) fresh = new UiSelector().text("").makeUiObject();
        return fresh;
    }

    public UiObject alexaList(){
        if (alexaList == null) alexaList = new UiSelector().text("").makeUiObject();
        return alexaList;
    }

    public UiObject prime(){
        if (prime == null) prime = new UiSelector().text("").makeUiObject();
        return prime;
    }

    public UiObject video(){
        if (video == null) video = new UiSelector().text("").makeUiObject();
        return video;
    }

    public UiObject music(){
        if (music == null) music = new UiSelector().text("").makeUiObject();
        return music;
    }

}
