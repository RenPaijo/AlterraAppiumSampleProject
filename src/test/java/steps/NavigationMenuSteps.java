package steps;

import io.cucumber.java.en.When;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }

}
