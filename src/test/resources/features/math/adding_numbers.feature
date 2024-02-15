@adding @android @math
Feature: Adding number

  Background:
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    Then user click button login

  @testAdd
  Scenario Outline: Adding some number
    When a is "<value1>"
    And b is "<value2>"
    And I run the operation a and b
    Then the total should be "<value3>"
    Examples:
      | value1 | value2 | value3    |
      | 1      | 2      | Hasil : 3 |
      | 2      | 3      | Hasil : 5 |
      | 3      | 4      | Hasil : 7 |
