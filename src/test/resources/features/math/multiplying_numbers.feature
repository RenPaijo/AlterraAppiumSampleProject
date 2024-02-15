@multiply @android @math
Feature: Multiplying number

  Background:
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    Then user click button login

  @testMultiply
  Scenario Outline: Adding some number
    When converts the operation to multiply
    And a is "<value1>"
    And b is "<value2>"
    And I run the operation a and b
    Then the total should be "<value3>"
    Examples:
      | value1 | value2 | value3       |
      | 14     | 28     | Hasil : 392  |
      | 27     | 81     | Hasil : 2187 |
      | 145    | 8      | Hasil : 1160 |