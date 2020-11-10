package api.apps.amazon.menu;

import api.Android;
import core.managers.UiObject;
import core.managers.UiSelector;
import org.aspectj.weaver.ast.And;

public class MenuUiObjects {

    private static UiObject
    menu,
    home,
    buyAgain,
    yourList,
    yourAccount,
    shopByDepartment,
    todaysDeals,
    madeInItaly,
    giftCardsRegistry,
    prime,
    seeAllPrograms,
    settings,
    customerService;
    private UiObject menuButton;

    public UiObject menuButton(){
        if (menuButton == null) menuButton = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/menuButton").makeUiObject();
        return menuButton;
    }

    public UiObject home(){
        if (home == null) home = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/home").makeUiObject();
        return home;
    }

    public UiObject buyAgain(){
        if (buyAgain == null) buyAgain = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/buyAgain").makeUiObject();
        return buyAgain;
    }

    public UiObject yourList(){
        if (yourList == null) yourList = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/yourList").makeUiObject();
        return yourList;
    }

    public UiObject yourAccount(){
        if (yourAccount == null) yourAccount = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/yourAccount").makeUiObject();
        return yourAccount;
    }

    public UiObject shopByDepartment(){
        if (shopByDepartment == null) shopByDepartment = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/shopByDepartment").makeUiObject();
        return shopByDepartment;
    }

    public UiObject todaysDeals(){
        if (todaysDeals == null) todaysDeals = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/todaysDeals").makeUiObject();
        return todaysDeals;
    }

    public UiObject madeInItaly(){
        if (madeInItaly == null) madeInItaly = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/madeInItaly").makeUiObject();
        return madeInItaly;
    }

    public UiObject giftCardsRegistry(){
        if (giftCardsRegistry == null) giftCardsRegistry = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/giftCardsRegistry").makeUiObject();
        return giftCardsRegistry;
    }

    public UiObject prime(){
        if (prime == null) prime = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/prime").makeUiObject();
        return prime;
    }

    public UiObject seeAllPrograms(){
        if (seeAllPrograms == null) seeAllPrograms = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/seeAllPrograms").makeUiObject();
        return seeAllPrograms;
    }

    public UiObject settings(){
        if (settings == null) settings = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/settings").makeUiObject();
        return settings;
    }

    public UiObject customerService(){
        if (customerService == null) customerService = new UiSelector().resourceId(Android.app.amazon.packageID()+":id/customerService").makeUiObject();
        return customerService;
    }
}
