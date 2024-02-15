package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @Then("user do long press on text")
  public void userDoLongPressOnText() {
    listPage.longPress();
  }

  @Then("user do tap multiple time on text")
  public void userDoTapMultipleTimeOnText() throws InterruptedException {
    listPage.tapMultiple();
  }
}
