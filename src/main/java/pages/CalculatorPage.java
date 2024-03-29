package pages;

import base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static drivers.AndroidDriverInit.driver;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public void inputNumbers(String a){
    type(MobileBy.id("com.isl.simpleapp:id/et_1"), a);
  }

  public void inputNumbers2(String b){
    type(MobileBy.id("com.isl.simpleapp:id/et_2"), b);
  }

  public void calculate(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }

  public void dropDown(){
    click(MobileBy.id("android:id/text1"));
  }

  public void multiply(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
            "FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
  }

  public void subtraction(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
            "FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
  }

  public void divide(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
            "FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
  }

  public String total(){
    By resultLocator = MobileBy.id("com.isl.simpleapp:id/tv_result");
    return driver.findElement(resultLocator).getText();
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

}
