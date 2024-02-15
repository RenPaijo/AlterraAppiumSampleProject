@subtract @android @math
Feature: Subtracting number

  Background:
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    Then user click button login

  @testSubtract
  Scenario Outline: Adding some number
    When converts the operation to subtract
    And a is "<value1>"
    And b is "<value2>"
    And I run the operation a and b
    Then the total should be "<value3>"
    Examples:
      | value1 | value2 | value3     |
      | 100    | 95     | Hasil : 5  |
      | 50     | 13     | Hasil : 37 |
      | 86     | 15     | Hasil : 71 |