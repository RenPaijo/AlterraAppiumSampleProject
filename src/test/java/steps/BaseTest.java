package steps;

import pages.CalculatorPage;
import pages.ListPage;
import pages.LoginPage;
import pages.NavigationMenu;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();
  public CalculatorPage calculatorPage = new CalculatorPage();
  public NavigationMenu navigationMenu = new NavigationMenu();
  public ListPage listPage = new ListPage();

}
