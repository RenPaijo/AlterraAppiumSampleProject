@divide @android @math
Feature: Dividing number

  Background:
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    Then user click button login

  @testDived
  Scenario Outline: Adding some number
    When converts the operation to division
    And a is "<value1>"
    And b is "<value2>"
    And I run the operation a and b
    Then the total should be "<value3>"
    Examples:
      | value1 | value2 | value3     |
      | 10     | 2      | Hasil : 5  |
      | 27     | 3      | Hasil : 9  |
      | 145    | 5      | Hasil : 29 |