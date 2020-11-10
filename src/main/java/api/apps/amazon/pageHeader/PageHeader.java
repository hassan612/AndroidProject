package api.apps.amazon.pageHeader;

import core.managers.MyLogger;

import java.util.NoSuchElementException;

public class PageHeader {

    public PageHeaderUiObjects uiObject = new PageHeaderUiObjects();

    public void tapWholeFood(){
        try {
            MyLogger.log.info("Tapping on the WholeFood button");
            uiObject.wholeFood().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap WholeFood Button, element either absent or blocked");
        }
    }

    public void tapFresh(){
        try {
            MyLogger.log.info("Tapping on the Fresh button");
            uiObject.fresh().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap Fresh Button, element either absent or blocked");
        }
    }

    public void tapAlexaList(){
        try {
            MyLogger.log.info("Tapping on the AlexaList button");
            uiObject.alexaList().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap AlexaList Button, element either absent or blocked");
        }
    }

    public void tapPrime(){
        try {
            MyLogger.log.info("Tapping on the Prime button");
            uiObject.prime().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap Prime Button, element either absent or blocked");
        }
    }

    public void tapVideo(){
        try {
            MyLogger.log.info("Tapping on the Video button");
            uiObject.video().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap Video Button, element either absent or blocked");
        }
    }

    public void tapMusic(){
        try {
            MyLogger.log.info("Tapping on the Music button");
            uiObject.music().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError(" Can't tap Music Button, element either absent or blocked");
        }
    }
}
