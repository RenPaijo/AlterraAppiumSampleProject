@login @android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive @scroll
  Scenario: Scrolling on list menu
    Then user do scroll

  @test @positive @longPress
  Scenario: Long press in list menu
    And user do scroll
    Then user do long press on text

  @test @positive @tapMultiple
  Scenario: Tap multiple time in list menu
    And user do scroll
    Then user do tap multiple time on text

