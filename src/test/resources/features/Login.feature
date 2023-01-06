Feature: Amazon Login

  @wip-Login
  Scenario: Login as user
    Given The user on the home page
    When The user is on the login page
    When The user enters email "ahmetreyiz0000@gmail.com" and password "Naim.5926/*-"
    Then The user should be on the home page after logged in
