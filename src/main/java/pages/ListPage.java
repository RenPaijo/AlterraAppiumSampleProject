package pages;

import base.BasePageObject;
import drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.time.Duration;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }

  public void longPress(){
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
            "new UiSelector().text(\"List ke-61\")"
    ));

    TouchAction touchAction = new TouchAction(AndroidDriverInit.driver);
    touchAction.longPress(ElementOption.element(element))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
            .release().perform();
  }

  public void tapMultiple() throws InterruptedException {
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
            "new UiSelector().text(\"List ke-59\")"
    ));

    for (int i = 0; i < 4; i++){
      element.click();
      Thread.sleep(800);
    }
  }

}
